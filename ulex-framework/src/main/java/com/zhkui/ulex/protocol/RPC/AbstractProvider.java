package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.common.Request;
import com.zhkui.ulex.common.Response;

import java.lang.reflect.Method;

public abstract class AbstractProvider<T> implements Provider<T>{

    private Class<T> clz;
    private T proxyImpl;

    public AbstractProvider(T proxyImpl, Class<T> clz){
        this.clz = clz;
        this.proxyImpl = proxyImpl;
    }


    public Response call(Request request){
        return invoke(request);
    }

    protected abstract Response invoke(Request request);

    /**
     * @return Class<T> return the clz
     */
    public Class<T> getInterface() {
        return clz;
    }

    public Method lookup(Request request){
        try{
            return clz.getMethod(request.getMethodName(),request.getParameterTypes());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return T return the proxyImpl
     */
    public T getProxyImpl() {
        return proxyImpl;
    }
}