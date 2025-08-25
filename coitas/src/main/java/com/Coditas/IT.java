package com.Coditas;

import org.springframework.stereotype.Component;

@Component("it")
public class IT implements Department{
    @Override
    public String getName() {

        return "This is IT Department";
    }
}
