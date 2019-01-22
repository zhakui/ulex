package com.zhkui.ulex.registry;

import java.io.Serializable;

public class RegistryEntity implements Serializable {
    
    private static final long serialVersionUID = 2334563566435693345L;

    private String host;
    private int port;
    private String path;
    private String username;
    private String password;

    public RegistryEntity(String host,int port, String path, String username, String password){
        this.host = host;
        this.port = port;
        this.path = path;
        this.username = username;
        this.password = password;
    }
}