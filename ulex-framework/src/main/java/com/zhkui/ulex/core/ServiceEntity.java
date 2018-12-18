package com.zhkui.ulex.core;

import java.io.Serializable;

public class ServiceEntity<T> implements Serializable{
    private static final long serialVersionUID = 2978234870203434903L;
    private String name;
    private String version;
    private long token;
    private Class<T> interfaceClase;
    private String secretKey;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return long return the token
     */
    public long getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(long token) {
        this.token = token;
    }

    /**
     * @return Class<T> return the interfaceClase
     */
    public Class<T> getInterfaceClase() {
        return interfaceClase;
    }

    /**
     * @param interfaceClase the interfaceClase to set
     */
    public void setInterfaceClase(Class<T> interfaceClase) {
        this.interfaceClase = interfaceClase;
    }

    /**
     * @return String return the secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey the secretKey to set
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

}