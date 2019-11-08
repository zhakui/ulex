package com.zhkui.ulex.common.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Serialization{

    ContentTypes getContetType();

    ObjectOutput serialize(OutputStream outputStream) throws IOException;

    ObjectInput deserialize(InputStream inputStream) throws IOException;
}