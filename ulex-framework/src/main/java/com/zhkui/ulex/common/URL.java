package com.zhkui.ulex.common;

/**
 * <p>Title: Ulex RPC</p>
 * <p>Description: Ulex RPC For Distribution</p>
 * <p>Copyright: Copyright (c) 2018-2020</p>
 * <p>Company: com.zhkui</p>
 * @author ZhangKui
 * @version 1.0
 */

import java.io.Serializable;

/**
 * url example:
 * registry://192.168.1.7:9090/com.zhkui.service1?param1=value1&amp;param2=value2
 */
public final class URL implements Serializable, Endpoint {

    private static final long serialVersionUID = 2892453467893459234L;
    private final String protocol;
    private final String host;
    private final int port;
    private final String path;
    private final String username;
    private final String password;

    public URL(String protocol,String host,int port){
        this(protocol,host,port,null,null,null);
    }

    public URL(String protocol,String host,int port, String path){
        this(protocol,host,port,path,null,null);
    }

    public URL(String protocol,String host,int port, String path, String username, String password){
        if ((username == null || username.length()==0) && password != null && password.length()>0 ){
            throw new IllegalArgumentException("Invalid url, password without username!");
        }

        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.username = username;
        this.password = password;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }
    
    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
