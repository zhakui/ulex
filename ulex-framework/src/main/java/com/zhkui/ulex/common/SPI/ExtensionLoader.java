package com.zhkui.ulex.common.SPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ExtensionLoader<T>{

    private static final String PREFIX = "META-INF";

    private final ClassLoader loader;

    private ConcurrentHashMap<String,String> extensionClass;

    private Class<T> type;

    private boolean isLoad = false;

    public ExtensionLoader(Class<T> type,ClassLoader loader){
        if (type == null){
            throw new NullPointerException("Type interface can not be null");
        }
        this.type = type;
        this.loader = (loader == null) ? ClassLoader.getSystemClassLoader() : loader;
    }

    public static <T> ExtensionLoader<T> getExtensionLoader(Class<T> type){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return new ExtensionLoader<>(type,loader);
    }


    public T getExtension(String name) throws LoaderException {
        T clz = null;
        if (name == null || name.isEmpty())
            throw new IllegalStateException(type.getName() + ": Extension name is null");
        try {
            if (!isLoad) LoadExtension();
            clz = getExtensionClass(extensionClass.get(name));
        } catch (LoaderException e) {
            fail(e.getMessage());
        }
        return clz;
    }

    public synchronized void LoadExtension() throws LoaderException{

        String fullPath = PREFIX +  type.getName();

        try{
            Enumeration<URL> configs = loader.getResources(fullPath);
            if (configs != null && configs.hasMoreElements()){
                while(configs.hasMoreElements()){
                    extensionClass.putAll(parse(configs.nextElement()));
                }
            }
            isLoad = true;
        }
        catch(IOException e){
            fail(type.getName() + ": Error closing configuration file");
        }    
    }

    private ConcurrentHashMap<String,String> parse(URL url) throws LoaderException{
        ConcurrentHashMap<String,String> extensions = new ConcurrentHashMap<>();
        InputStream in = null;
        BufferedReader reader = null;
        try {
            in =  url.openStream();
            reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            while(true){
                String content = reader.readLine();
                if (content == null) break;
                Optional.ofNullable(parseLine(content))
                .ifPresent((v)->extensions.put(v[0],v[1]));
            }
        } catch (IOException e) {
            fail(type.getName() + ": Error closing configuration file");
        }
        finally{
            try {
                if (reader != null) reader.close();
                if (in != null) in.close();
            } catch (IOException y) {
                fail(type.getName() + ": Error closing configuration file");
            }
        }
        return extensions;
    }

    private String[] parseLine(String content) throws LoaderException{
        int c = content.indexOf("#");
        content =  content.substring(0,c);
        content = content.trim();
        int n = content.length();
        if (n > 0){
            int cp = content.codePointAt(0);
            if (!Character.isJavaIdentifierStart(cp))
                fail("No a valid extension package name");
            for (int i = Character.charCount(cp); i < n; i += Character.charCount(cp)) {
                cp = content.codePointAt(i);
                if (!Character.isJavaIdentifierPart(cp) && (cp != '.'))
                    fail("No a valid extension package name");        
            }
            return content.split(content);
        }
        return null;
    }

    private T getExtensionClass(String name) throws LoaderException{
        T clz = null;
        Class<?> cls = null;
        try {
            cls = Class.forName(name);
        } catch (ClassNotFoundException e) {
            fail("No a valid extension package name");
        }
        if (!type.isAssignableFrom(cls))
            fail("No a valid extension package name");
        try {
            clz = type.cast(cls);
        } catch (Exception e) {
            fail("No a valid extension package name");
        }
        return clz;
    }

    private void fail(String msg) throws LoaderException{
        throw new LoaderException(msg);
    }

}