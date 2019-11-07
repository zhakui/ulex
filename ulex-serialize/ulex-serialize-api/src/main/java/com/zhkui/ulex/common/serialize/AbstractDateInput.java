package com.zhkui.ulex.common.serialize;

import java.io.InputStream;

public abstract class AbstractDateInput implements DateInput{

    protected InputStream inputStream;

    public AbstractDateInput(InputStream inputStream) {
        this.inputStream = inputStream;
    }

}