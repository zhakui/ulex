package com.zhkui.ulex.common.serialize;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractDateOutput implements DateOutput {

    protected OutputStream outputStream;

    public AbstractDateOutput(OutputStream os){
        this.outputStream = os;
    }

    public void writeByet(byte data) throws IOException {
        writeObject(data);
    }

    public void writeInt(int data) throws IOException{
        writeObject(data);
    }

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