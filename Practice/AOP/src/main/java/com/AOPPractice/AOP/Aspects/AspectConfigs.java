package com.AOPPractice.AOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfigs {

    @Before("execution(* com.AOPPractice.AOP.Controller.AppController.*(..))")
    public void loginmethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logged in! method name is "+ methodName);
    }

    @After("execution(* com.AOPPractice.AOP.Controller.AppController.*(..))")
    public void loggedoutmethod(){
        System.out.println("logged out!");
    }
    // Use of pointcut
    @Pointcut("execution(* com.AOPPractice.AOP.Controller.AppController.get*(..))")
    public void logBeforeGetMapping() {
    }
    @Before("logBeforeGetMapping()")
    public void allgetMethod(){
        System.out.println("Executing get method ----> making use of @Pointcut");
    }


    @Pointcut("execution(* com.AOPPractice.AOP.Controller.AppController.add*(..))")
    public void logBeforePostMapping() {
    }
    @Pointcut("execution(* com.AOPPractice.AOP.Controller.AppController.delete*(..))")
    public void logBeforeDeleteMapping() {
    }
    @Pointcut("execution(* com.AOPPractice.AOP.Controller.AppController.update*(..))")
    public void logBeforePutMapping() {
    }
    @After("logBeforePostMapping() || logBeforeDeleteMapping() || logBeforePutMapping() ")
    public void logOfDabaseModification(){
        System.out.println("Database is modified!  <------> demonstrating use of combining pointcut");
    }
    @AfterReturning(
            pointcut = "execution(* com.AOPPractice.AOP.Controller.AppController.add*(..))",
            returning = "result"
    )
    public void afterReturningAdvice(Object result) {
        System.out.println("New account saved in DB: " + result+"     <----> Demonstrating use of @AfterReturning");
    }

    @Pointcut("execution(* com.AOPPractice.AOP.Controller.AppController.testOrderAnnot())")
    public void adv1(){}

    //     AfterThrowing

    @AfterThrowing(
            pointcut = "execution(* com.AOPPractice.AOP.Controller.AppController.getAllLoop(..))",
            throwing = "ex"
    )
    public void logAfterThrowing(Exception ex) {
        System.out.println(" Exception occured: " + ex.getMessage());
    }


//    @Around("execution(* com.AOPPractice.AOP.Service.AccountService.getAllLoop(..))")
//    public Object handleMissingAccount(ProceedingJoinPoint joinPoint) {
//        try {
//            return joinPoint.proceed();
//        } catch (Throwable e) {
//            System.out.println(" Exception handled in @Around: " + e.getMessage());
//            return e.getMessage();
//        }
//    }


}
