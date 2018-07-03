package com.zhkui.ulex.registry;

import com.zhkui.ulex.common.URL;

import java.io.Serializable;

public class RegistryEntity implements Serializable {

    private final String protocol;
    private final String host;
    private final String port;
    private final String path;
    private final String username;
    private final String password;

    public RegistryEntity(String protocol,String host,String port, String path, String username, String password){
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.username = username;
        this.password = password;
    }

    public URL gerUrl(){
        return new URL(protocol,host,port,path,username,password);
    }

}
