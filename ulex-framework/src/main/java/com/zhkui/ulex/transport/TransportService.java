package com.zhkui.ulex.transport;


public interface TransportService{
    
    public void run();

    public void stop();

    public boolean isRunning();

}