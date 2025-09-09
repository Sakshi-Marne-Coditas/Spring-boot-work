package com.Coditas.Exceptionhandeling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@ResponseBody
//@RestControllerAdvice     apn he suddha use kru shakto it is mixture of above annotations
public class GlobalExcptionhandler {

    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmetic(ArithmeticException ex) {
        return "Devide by zero is not allowed!";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFound(UserNotFoundException ex) {
        return "Error: " + ex.getMessage();
    }
}
