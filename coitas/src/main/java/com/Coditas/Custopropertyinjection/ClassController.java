package com.Coditas.Custopropertyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
    Cunstombyvalue cunstombyvalue;
    ConfigurationPropertiesServiceClass serviceClass;

    @Autowired
    public ClassController(Cunstombyvalue cunstombyvalue, ConfigurationPropertiesServiceClass serviceClass ){
        this.cunstombyvalue=cunstombyvalue;
        this.serviceClass=serviceClass;
    }

    @GetMapping("/detailsbyvalue")
    public String printDetails(){

        return cunstombyvalue.printDetails();
    }
    @GetMapping("/details")
    public String printValues(){

        return serviceClass.printValues();
    }
}
