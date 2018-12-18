package com.zhkui.ulex.common.SPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ExtensionLoader<T>{

    private static final String PREFIX = "META-INF";

    private final ClassLoader loader;

    private ConcurrentHashMap<String,Class<T>> extensionClass;

    private Class<T> type;

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


    public T getExtension(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalStateException(type.getName() + ": Extension name is null");
        
        return null;

    }

    public synchronized ConcurrentHashMap<String,Class<T>> LoadExtension(){

        ConcurrentHashMap<String,Class<T>> extensions = new ConcurrentHashMap<>();

        String fullPath = PREFIX +  type.getName();

        try{
            Enumeration<URL> configs = loader.getResources(fullPath);
            if (configs != null && configs.hasMoreElements()){
                while(configs.hasMoreElements()){
                    parse(configs.nextElement());
                }
            }
            
        }
        catch(IOException e){
            
        }
        
        return extensions;
    }

    private void parse(URL url){
        try {
            InputStream in =  url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            while(true){
                String content = reader.readLine();
                if (content == null) break;
                parseLine(content);
            }
            
        } catch (Exception e) {
        }
    }

    private String[] parseLine(String content) {
        int c = content.indexOf("#");
        content =  content.substring(0,c);
        content = content.trim();
        int n = content.length();
        if (n > 0){
            if ((content.indexOf(' ') >= 0) || (content.indexOf('\t') >= 0))
                throw new IllegalStateException("No a valid extension package name");
            int cp = content.codePointAt(0);
            if (!Character.isJavaIdentifierStart(cp))
                throw new IllegalStateException("No a valid extension package name");
            for (int i = Character.charCount(cp); i < n; i += Character.charCount(cp)) {
                cp = content.codePointAt(i);
                if (!Character.isJavaIdentifierPart(cp) && (cp != '.'))
                    throw new IllegalStateException("No a valid extension package name");
                    
            }
            return content.split(content);
        }
        return null;
    }
}