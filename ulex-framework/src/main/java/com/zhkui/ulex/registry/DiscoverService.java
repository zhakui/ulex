package com.zhkui.ulex.registry;

import java.util.List;

public interface DiscoverService {
    /**
     * subscribe service to registration center
     *
     * @param url
     */
    void subscribe(String path) throws Exception;

    /**
     * unsubscribe service to registration center
     *
     * @param url
     */
    void unsubscribe(String path) throws Exception;

    
    List<String> discover(String path) throws Exception;
}