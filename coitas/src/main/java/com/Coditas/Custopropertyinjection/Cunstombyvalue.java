package com.Coditas.Custopropertyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Cunstombyvalue {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private int version;

    @Value("${app.timeout}")
    private int timeout;

    public String printDetails() {
//        System.out.println("App Name: " + name);
//        System.out.println("Version: " + version);
//        System.out.println("Timeout: " + timeout);
        return "App name is "+name+"Version is "+version+"Timeout is "+timeout;
    }


}
