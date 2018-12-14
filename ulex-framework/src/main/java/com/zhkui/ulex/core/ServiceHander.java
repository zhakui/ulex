package com.zhkui.ulex.core;

import com.zhkui.ulex.common.Request;
import com.zhkui.ulex.common.Response;;

public interface ServiceHander {

    public Response hander(Request request, Response respone);

}