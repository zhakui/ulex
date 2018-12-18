package com.zhkui.ulex.registry;
/**
 * <p>Title: Ulex RPC</p>
 * <p>Description: Ulex RPC For Distribution</p>
 * <p>Copyright: Copyright (c) 2018-2020</p>
 * <p>Company: com.zhkui</p>
 * @author ZhangKui
 * @version 1.0
 */
import com.zhkui.ulex.common.URL;

public interface RegistryService {
    /**
     * register service to registration center
     *
     * @param url
     */
    void register(URL url) throws Exception;

    /**
     * unregister service to registration center
     *
     * @param url
     */
    void unregister(URL url) throws Exception;
}
