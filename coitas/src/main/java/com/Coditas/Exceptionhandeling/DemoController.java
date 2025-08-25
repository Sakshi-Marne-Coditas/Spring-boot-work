package com.Coditas.Exceptionhandeling;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exceptionhandeling")
public class DemoController {

    @GetMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        return "Result: " + (a / b);
    }

    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException ex) {
        return "Error: Cannot divide by zero!";
    }

    @GetMapping("/customexception/{id}")
    public String getUser(@PathVariable int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with id "+ id+" not found!");
        }
        return "User Found";
    }
}

