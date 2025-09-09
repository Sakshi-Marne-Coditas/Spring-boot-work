package com.AOPPractice.AOP.Aspects;



import com.AOPPractice.AOP.Model.Message;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {

    // -------- @Before Advice --------
    @Before("execution(* com.example.restaop.controller.SimpleController.addMessage(..))")
    public void beforeAdd(JoinPoint joinPoint) {
        System.out.println(">>> @Before: addMessage is about to run");
        Object[] args = joinPoint.getArgs();
        for(Object arg : args) {
            if(arg instanceof Message msg) {
                System.out.println("Message content: " + msg.getContent());
            }
        }
    }

    // -------- @AfterReturning Advice --------
    @AfterReturning(pointcut = "execution(* com.example.restaop.controller.SimpleController.getMessage(..))", returning = "result")
    public void afterGet(JoinPoint joinPoint, Object result) {
        System.out.println(">>> @AfterReturning: getMessage returned -> " + result);
    }

    // -------- @AfterThrowing Advice --------
    @AfterThrowing(pointcut = "execution(* com.example.restaop.controller.SimpleController.addMessage(..))", throwing = "ex")
    public void afterThrow(JoinPoint joinPoint, Throwable ex) {
        System.out.println(">>> @AfterThrowing: Exception -> " + ex.getMessage());
    }

    // -------- @Around Advice --------
    @Around("execution(* com.accproject.service.*.*(..))")
    public Object handleException(ProceedingJoinPoint pjp) throws Throwable {
        try {
            return pjp.proceed();
        } catch (Exception ex) {
            System.out.println("⚠️ Exception handled in @Around: " + ex.getMessage());
            return "Record not found"; // default response, loop continue karega
        }
    }
}

