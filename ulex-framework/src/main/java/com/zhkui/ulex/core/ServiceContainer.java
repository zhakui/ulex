package com.zhkui.ulex.core;

import java.util.HashMap;
import com.zhkui.ulex.protocol.RPC.Provider;

public class ServiceContainer<T>{
    private HashMap<String,Provider> services;

    public ServiceContainer(){}

    public Object getService(String name){
        return services.get(name);
    }

    public void putServices(String name, Provider<T> service) {
        this.services.put(name, service);
    }

}