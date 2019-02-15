package com.zhkui.ulex.protocol.RPC;

public abstract class AbstractExporter<T> implements Exporter<T>{
    private Provider<T> provider;

    public AbstractExporter(Provider<T> provider) {
        this.provider = provider;
    }    


    /**
     * @return Provider<T> return the provider
     */
    public Provider<T> getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(Provider<T> provider) {
        this.provider = provider;
    }

}