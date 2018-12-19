package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.registry.RegistryService;
import com.zhkui.ulex.transport.BaseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhkui.ulex.common.URL;

public class RPCService {
    Logger logger = LoggerFactory.getLogger(RPCService.class);

    private BaseService baseService;

    private RegistryService registryService;

    public RPCService(){}

    public void export(){
        baseService.run();
    }

    public void registry(URL url){
        try{
            registryService.register(url);
        }catch(Exception e){
            
        }
        
    }

    public void main (){
        logger.info("RPC service start");

        
    }

}