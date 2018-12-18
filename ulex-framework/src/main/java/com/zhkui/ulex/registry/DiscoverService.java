package com.zhkui.ulex.registry;

import com.zhkui.ulex.common.URL;

public interface DiscoverService {
    /**
     * subscribe service to registration center
     *
     * @param url
     */
    void subscribe(URL url) throws Exception;

    /**
     * unsubscribe service to registration center
     *
     * @param url
     */
    void unsubscribe(URL url) throws Exception;
}