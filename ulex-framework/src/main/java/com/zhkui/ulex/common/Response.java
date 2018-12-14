package com.zhkui.ulex.common;

import java.util.Map;

public interface Response {

    int getResponseApi();

    long getResponseId();

    Exception getException();

    Object getResult();

    Map<String, String> getAttachments();

    String getAttachment(String key);

    String getAttachment(String key, String defaultValue);

    void setAttachment(String key, String value);
}
