package com.zhkui.ulex.common.serialize;

import java.io.IOException;

public interface DateOutput {
    void writeByet(byte date) throws IOException;

    void writeInt(int date) throws IOException;

    void writeLong(Long date) throws IOException;

    void writeFloat(float date) throws IOException;

    void writeDouble(double date) throws IOException;

    void writeString(String date) throws IOException;

    void writeBoolean(boolean date) throws IOException;

    void readByets(byte[] date) throws IOException;

    void writeObject(Object obj) throws IOException;
}
