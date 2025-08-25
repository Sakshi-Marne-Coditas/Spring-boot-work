package com.securityPractice;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping("/hello")
    public String printValue(){
        return "Hello";
    }
    @GetMapping("/userrole")
    @PreAuthorize("hasRole('USER')")
    public String printuser() {
        return "Hello user!";
    }


    @GetMapping("/adminrole")
    @PreAuthorize("hasRole('ADMIN')")
    public String printadmin() {
        return "Hello admin";
    }

}
