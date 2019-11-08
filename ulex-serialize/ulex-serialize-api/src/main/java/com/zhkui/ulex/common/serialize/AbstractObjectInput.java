package com.zhkui.ulex.common.serialize;

import java.io.IOException;
import java.io.InputStream;

public abstract class AbstractObjectInput implements ObjectInput {

    protected InputStream inputStream;

    public AbstractObjectInput(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public byte readByet() throws IOException {
        byte value = 0;
        try {
            value = readObject(byte.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public int readInt() throws IOException {
        int value = 0;
        try {
            value = readObject(int.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public long readLong() throws IOException {
        long value = 0;
        try {
            value = readObject(long.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public float readFloat() throws IOException {
        float value = 0;
        try {
            value = readObject(float.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public double readDouble() throws IOException {
        double value = 0;
        try {
            value = readObject(double.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public String readString() throws IOException {
        String value = "";
        try {
            value = readObject(String.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean readBoolean() throws IOException {
        boolean value = false;
        try {
            value = readObject(boolean.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public Object readObject() throws IOException {
        Object value = false;
        try {
            value = readObject(Object.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }
}