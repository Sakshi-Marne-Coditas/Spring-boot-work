package com.AOPPractice.AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Pointcut2 {
    @Before("com.AOPPractice.AOP.Aspects.AspectConfigs.adv1()")
    public void authorization(){
        System.out.println("Authorization done!");
    }
}
