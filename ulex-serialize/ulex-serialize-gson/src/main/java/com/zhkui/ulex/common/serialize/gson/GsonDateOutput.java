package com.zhkui.ulex.common.serialize.gson;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;
import com.zhkui.ulex.common.serialize.AbstractDateOutput;

public class GsonDateOutput extends AbstractDateOutput {

    Gson gson = new Gson();
    OutputStreamWriter writer;

    public GsonDateOutput(OutputStream os) throws IOException {
        super(os);
        writer = new OutputStreamWriter(outputStream);
    }

    @Override
    public void writeByets(byte[] data) throws IOException {
        outputStream.write(data);
    }

    public void writeObject(Object obj) throws IOException {
        char[] json = gson.toJson(obj).toCharArray();
        writer.write(json, 0, json.length);
        writer.flush();
        writer.close();
    }
    
}
