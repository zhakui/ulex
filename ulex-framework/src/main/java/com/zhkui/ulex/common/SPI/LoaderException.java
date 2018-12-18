package com.zhkui.ulex.common.SPI;

public class LoaderException extends Exception{
    private static final long serialVersionUID = 2034897190745766939L;

    public LoaderException(String msg){
        super(msg);
    }

    public LoaderException(String msg, Throwable cause){
        super(msg,cause);
    }
}