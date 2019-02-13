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

    /**
     * @return String return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return int return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return String return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}