package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.common.Request;
import com.zhkui.ulex.common.Response;

public abstract class AbstractProvider<T> implements Provider<T>{


    public Response call(Request request){
        return invoke(request);
    }

    protected abstract Response invoke(Request request);
}