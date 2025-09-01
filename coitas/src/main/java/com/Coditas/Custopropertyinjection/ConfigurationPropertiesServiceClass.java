package com.Coditas.Custopropertyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationPropertiesServiceClass {
    Custombyconfigurationproperties custombyproperty;
    @Autowired
    public ConfigurationPropertiesServiceClass(Custombyconfigurationproperties custombyproperty) {
        this.custombyproperty=custombyproperty;

    }

    public String printValues(){
        return "name is "+custombyproperty.getName()+" version is "+custombyproperty.getVersion()+" timeout is "+custombyproperty.getTimeout();
    }
}
