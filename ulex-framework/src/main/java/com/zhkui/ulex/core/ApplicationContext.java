package com.zhkui.ulex.core;


public class ApplicationContext {
    private ApplicationEntity application;

    /**
     * @return ApplicationEntity return the application
     */
    public ApplicationEntity getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(ApplicationEntity application) {
        this.application = application;
    }

}