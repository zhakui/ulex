package com.zhkui.ulex.protocol.RPC;

import com.zhkui.ulex.common.Request;
import com.zhkui.ulex.common.Response;

public interface Caller<T>{
    Response call(Request request); 
}