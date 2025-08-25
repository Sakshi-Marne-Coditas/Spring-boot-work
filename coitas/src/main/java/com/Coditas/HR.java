package com.Coditas;

import org.springframework.stereotype.Component;

@Component
public class HR implements Department{

    @Override
    public String getName() {

        return "This is HR Department";
    }
}
