package com.zhkui.ulex.codec;

import java.io.IOException;

public interface Codec {

    byte[] encode(Object message) throws IOException;

    Object decode(byte messageType, byte[] data) throws IOException;
}