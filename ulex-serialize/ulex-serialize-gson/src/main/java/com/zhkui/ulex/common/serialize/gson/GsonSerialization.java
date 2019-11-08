package com.zhkui.ulex.common.serialize.gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.zhkui.ulex.common.serialize.ContentTypes;
import com.zhkui.ulex.common.serialize.ObjectInput;
import com.zhkui.ulex.common.serialize.ObjectOutput;
import com.zhkui.ulex.common.serialize.Serialization;

public class GsonSerialization implements Serialization {

    public ContentTypes getContetType() {
        return ContentTypes.SERIALIZATION_CONTENT_TYEP_JSON;
    }

    public ObjectOutput serialize(OutputStream outputStream) throws IOException {
        return new GsonObjectOutput(outputStream);
    }

    public ObjectInput deserialize(InputStream inputStream) throws IOException {
        return new GsonObjectInput(inputStream);
    }
}