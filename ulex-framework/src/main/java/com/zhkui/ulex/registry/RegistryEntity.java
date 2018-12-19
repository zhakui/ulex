package com.zhkui.ulex.registry;

import com.zhkui.ulex.common.URL;
import java.io.Serializable;

public class RegistryEntity implements Serializable {
    
    private static final long serialVersionUID = 2334563566435693345L;

    private URL url;

    public RegistryEntity(String protocol,String host,int port, String path, String username, String password){
        this.url = new URL(protocol,host,port,path,username,password);
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

}
