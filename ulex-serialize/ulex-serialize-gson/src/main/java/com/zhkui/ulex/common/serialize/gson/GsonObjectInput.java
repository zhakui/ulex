package com.zhkui.ulex.common.serialize.gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.zhkui.ulex.common.serialize.AbstractObjectInput;

public class GsonObjectInput extends AbstractObjectInput {
    private Gson gson;
    private BufferedReader reader;

    public GsonObjectInput(InputStream inputStream) {
        super(inputStream);
        gson = new Gson();
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public byte[] readByets() throws IOException {
        return reader.lines().toString().getBytes();
    }

    public <T> T readObject(Class<T> cls) throws IOException, ClassNotFoundException {
        T object = gson.fromJson(reader, cls);
        reader.close();
        return object;
    }
}