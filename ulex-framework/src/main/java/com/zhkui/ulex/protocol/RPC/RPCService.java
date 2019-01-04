package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.transport.TransportService;
import com.zhkui.ulex.core.ServiceContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RPCService {
    Logger logger = LoggerFactory.getLogger(RPCService.class);

    private ServiceContainer serviceContainer;

    private TransportService transportService;

    public RPCService(TransportService transportService){
        this.transportService = transportService;
    }

    public void export(){
        transportService.run();
    }

    public void main (){
        logger.info("RPC service start"); 
    }


    /**
     * @return ServiceContainer return the serviceContainer
     */
    public ServiceContainer getServiceContainer() {
        return serviceContainer;
    }

    /**
     * @param serviceContainer the serviceContainer to set
     */
    public void setServiceContainer(ServiceContainer serviceContainer) {
        this.serviceContainer = serviceContainer;
    }
}