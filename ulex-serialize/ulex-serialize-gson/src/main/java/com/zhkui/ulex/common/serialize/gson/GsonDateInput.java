package com.zhkui.ulex.common.serialize.gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.zhkui.ulex.common.serialize.AbstractDateInput;

public class GsonDateInput extends AbstractDateInput {
    private Gson gson;
    private BufferedReader reader;

    public GsonDateInput(InputStream inputStream) {
        super(inputStream);
        gson = new Gson();
    }

    private GsonDateInput(InputStream inputStream, InputStreamReader inputStreamReader) {
        super(inputStream);
        gson = new Gson();
        reader = new BufferedReader(inputStreamReader);
    }

    public byte readByet() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    public int readInt() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    public long readLong() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    public float readFloat() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    public double readDouble() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    public String readString() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean readBoolean() throws IOException {
        // TODO Auto-generated method stub
        return false;
    }

    public byte[] readByets() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    public Object readObject() throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T readObject(Class<T> cls) throws IOException, ClassNotFoundException {
        reader.readLine();
        return null;
    }


}