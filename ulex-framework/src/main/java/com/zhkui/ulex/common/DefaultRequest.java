package com.zhkui.ulex.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DefaultRequest implements Serializable, Request {

    private static final long serialVersionUID = 2345877839459150345L;

    private int requestApi;

    private long requestId;

    private String interfaceName;

    private String methodName;

    private Object[] arguments;

    private Class<?>[] parameterTypes;

    private Map<String,String> attachments;

    public int getRequestApi() {
        return requestApi;
    }

    public void setRequestApi(int requestApi){
        this.requestApi = requestApi;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId){
        this.requestId = requestId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object[] arguments) {
        this.arguments = arguments;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
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
            attachments = new HashMap<String,String>();
        }
        attachments.put(key,value);
    }
}
