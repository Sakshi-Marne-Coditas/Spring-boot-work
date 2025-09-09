package com.AOPPractice.AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Pointcut3 {
    @Before("com.AOPPractice.AOP.Aspects.AspectConfigs.adv1()")
    public void login(){
        System.out.println("Login successfully!");
    }
}
