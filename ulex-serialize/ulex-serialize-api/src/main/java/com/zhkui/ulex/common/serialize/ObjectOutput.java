package com.zhkui.ulex.common.serialize;

import java.io.IOException;

public interface ObjectOutput {
    void writeByet(byte data) throws IOException;

    void writeInt(int data) throws IOException;

    void writeLong(Long data) throws IOException;

    void writeFloat(float data) throws IOException;

    void writeDouble(double data) throws IOException;

    void writeString(String data) throws IOException;

    void writeBoolean(boolean data) throws IOException;

    void writeByets(byte[] data) throws IOException;

    void writeObject(Object obj) throws IOException;
}
