package com.zhkui.ulex.serialization;

import java.io.IOException;

public interface Serializer {

    public byte[] serialize(Object msg) throws IOException;

    public <T> T deserialize(byte[] data, Class<T> type) throws IOException;

}