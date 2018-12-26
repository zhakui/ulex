package com.zhkui.ulex.core;


public class ApplicationContext {
    private ApplicationConfig application;

    /**
     * @return ApplicationEntity return the application
     */
    public ApplicationConfig getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(ApplicationConfig application) {
        this.application = application;
    }

}