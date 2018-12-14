package com.zhkui.ulex.common;

import java.util.Map;

public interface Request {

    int getRequestApi();

    long getRequestId();

    String getInterfaceName();

    String getMethodName();

    Object[] getArguments();

    Class<?>[] getParameterTypes();

    Map<String, String> getAttachments();

    String getAttachment(String key);

    String getAttachment(String key, String defaultValue);

    void setAttachment(String key, String value);
}
