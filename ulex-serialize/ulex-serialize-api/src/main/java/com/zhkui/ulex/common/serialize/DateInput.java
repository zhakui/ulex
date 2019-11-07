package com.zhkui.ulex.common.serialize;

import java.io.IOException;

public interface DateInput {

    byte readByet() throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    float readFloat() throws IOException;

    double readDouble() throws IOException;

    String readString() throws IOException;

    boolean readBoolean() throws IOException;

    byte[] readByets() throws IOException;

    Object readObject() throws IOException;

    <T> T readObject(Class<T> cls) throws IOException, ClassNotFoundException;

}