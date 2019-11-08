package com.zhkui.ulex.common.serialize;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractObjectOutput implements ObjectOutput {

    protected OutputStream outputStream;

    public AbstractObjectOutput(OutputStream os){
        this.outputStream = os;
    }

    @Override
    public void writeByet(byte data) throws IOException {
        writeObject(data);
    }

    @Override
    public void writeInt(int data) throws IOException{
        writeObject(data);
    }

    @Override
    public void writeLong(Long data) throws IOException{
        writeObject(data);
    }

    public void writeFloat(float data) throws IOException{
        writeObject(data);
    }

    public void writeDouble(double data) throws IOException{
        writeObject(data);
    }

    public void writeString(String data) throws IOException{
        writeObject(data);
    }

    public void writeBoolean(boolean data) throws IOException{
        writeObject(data);
    }
    
    public void writeByets(byte[] data) throws IOException{
        writeObject(data);
    }

}