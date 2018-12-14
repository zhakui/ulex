package com.zhkui.ulex.transport;

import java.util.concurrent.atomic.AtomicBoolean;
import com.zhkui.ulex.common.Endpoint;
import com.zhkui.ulex.core.ServiceRouter;

public abstract class AbstractService implements BaseService{

    protected Endpoint endpoint;

    protected AtomicBoolean isRunning;

    protected ServiceRouter serviceRouter;

    public AbstractService(Endpoint endpoint, ServiceRouter serviceRouter){

        this.endpoint = endpoint;

        this.serviceRouter = serviceRouter;

        this.isRunning.set(false);
    }

    /**
     * @return Endpoint return the endpoint
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * @param endpoint the endpoint to set
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return ServiceRouter return the serviceRouter
     */
    public ServiceRouter getServiceRouter() {
        return serviceRouter;
    }

    /**
     * @param serviceRouter the serviceRouter to set
     */
    public void setServiceRouter(ServiceRouter serviceRouter) {
        this.serviceRouter = serviceRouter;
    }

}