package com.zhkui.ulex.core;

import java.util.HashMap;

public class ServiceContainer{
    private HashMap<String,Object> services;

    public ServiceContainer(){}

    public Object getService(String name){
        return services.get(name);
    }

    public void putServices(String name, Object service) {
        this.services.put(name, service);
    }

}