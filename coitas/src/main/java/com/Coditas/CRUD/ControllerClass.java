package com.Coditas.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class ControllerClass {

    private final ServiceClass serviceClass;
    @Autowired
    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @PostMapping("/insert")
    public EntityClass insertData(@RequestBody EntityClass entityClass){
        return serviceClass.insertData(entityClass);

    }
    @GetMapping("/getallemp")
    public List<EntityClass> getAllEmployees(){
        return serviceClass.getAllEmployees();
    }
    @DeleteMapping("/deleteemp")
    public String deleteEmployee(@RequestParam int employeeId){
        return serviceClass.deletebyEmployee(employeeId);
    }


}
