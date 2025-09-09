package com.AOPPractice.AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcut1 {
    @Before("com.AOPPractice.AOP.Aspects.AspectConfigs.adv1()")
    public void authenticate(){
        System.out.println("authenticated successfully!");
    }
}
