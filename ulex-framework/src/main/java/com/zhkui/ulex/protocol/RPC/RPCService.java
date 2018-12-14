package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.registry.RegistryService;
import com.zhkui.ulex.transport.BaseService;
import com.zhkui.ulex.common.URL;

public class RPCService {

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


}