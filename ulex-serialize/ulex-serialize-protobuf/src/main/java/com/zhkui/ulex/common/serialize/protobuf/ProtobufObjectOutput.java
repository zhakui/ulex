package com.zhkui.ulex.common.serialize.protobuf;

import java.io.IOException;
import java.io.OutputStream;

import com.zhkui.ulex.common.serialize.AbstractObjectOutput;

public class ProtobufObjectOutput extends AbstractObjectOutput {

    public ProtobufObjectOutput(OutputStream os) {
        super(os);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void writeByets(byte[] data)throws IOException {
        // TODO Auto-generated method stub

    }

    public void writeObject(Object obj) throws IOException {
        // TODO Auto-generated method stub

    }
  
}
