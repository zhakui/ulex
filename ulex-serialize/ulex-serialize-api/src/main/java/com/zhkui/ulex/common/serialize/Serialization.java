package com.zhkui.ulex.common.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Serialization{

    ContentTypes getContetType();

    DateOutput serialize(InputStream is) throws IOException;

    DateInput deserialize(OutputStream os) throws IOException;
}