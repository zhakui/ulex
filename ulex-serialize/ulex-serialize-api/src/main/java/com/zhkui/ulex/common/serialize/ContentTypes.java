package com.zhkui.ulex.common.serialize;

public enum ContentTypes{
    SERIALIZATION_CONTENT_TYEP_JSON("text/json"),
    SERIALIZATION_CONTENT_TYEP_XML("text/xml"),
    SERIALIZATION_CONTENT_TYEP_PROTOBUF("text/proto");

    private String type;

    private ContentTypes(String type){
        this.type = type;
    }

    public String getContent(){
        return this.type;
    }

}