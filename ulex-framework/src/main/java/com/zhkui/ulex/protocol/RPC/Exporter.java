package com.zhkui.ulex.protocol.RPC;

public interface Exporter<T>{

    Provider<T> getProvider();

    void unexport();
}
