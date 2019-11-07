package com.zhkui.ulex.common.serialize.gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.zhkui.ulex.common.serialize.ContentTypes;
import com.zhkui.ulex.common.serialize.DateInput;
import com.zhkui.ulex.common.serialize.DateOutput;
import com.zhkui.ulex.common.serialize.Serialization;

public class GsonSerialization implements Serialization {

    public ContentTypes getContetType() {
        return ContentTypes.SERIALIZATION_CONTENT_TYEP_JSON;
    }

    public DateOutput serialize(OutputStream outputStream) throws IOException {
        return new GsonDateOutput(outputStream);
    }

    public DateInput deserialize(InputStream inputStream) throws IOException {
        return new GsonDateInput(inputStream);
    }
}