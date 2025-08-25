package com.Coditas.rest;

import com.Coditas.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Department dept;

    @Autowired
    public Controller(@Qualifier("it") Department dept){
        this.dept = dept;
    }

    @GetMapping("/department")
    public String getDepartment(){
        return dept.getName();
    }
}
