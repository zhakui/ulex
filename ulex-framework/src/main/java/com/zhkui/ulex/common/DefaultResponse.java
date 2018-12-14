package com.zhkui.ulex.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DefaultResponse implements Serializable, Response {

    private static final long serialVersionUID = 2345877345394593345L;
    
    private int responseApi;

    private long responseId;

    private Exception exception;

    private Object result;

    private Map<String, String> attachments;

    public int getResponseApi() {
        return responseApi;
    }

    public void setResponseApi(int responseApi) {
        this.responseApi = responseApi;
    }

    public long getResponseId() {
        return responseId;
    }

    public void setResponseId(long responseId) {
        this.responseId = responseId;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Map<String, String> getAttachments() {
        return attachments;
    }

    public void setAttachments(Map<String, String> attachments) {
        this.attachments = attachments;
    }

    public String getAttachment(String key) {
        return attachments.get(key);
    }

    public String getAttachment(String key, String defaultValue) {
        return attachments.containsKey(key) ? attachments.get(key) : defaultValue;
    }

    public void setAttachment(String key, String value) {
        if (attachments == null){
            attachments = new HashMap<String, String>();
        }
        attachments.put(key,value);
    }
}
