package com.Coditas.Custopropertyinjection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class Custombyconfigurationproperties {
    private String name;
    private int version;
    private int timeout;

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
