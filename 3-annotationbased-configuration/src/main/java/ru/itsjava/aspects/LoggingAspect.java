package ru.itsjava.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//
//    @Before("execution (* ru.itsjava.*.*.*(..))")
//    public void logBefore(JoinPoint joinPoint){
//        System.out.println("Before Method:" + joinPoint.getSignature().getName());
//    }
//
//
//    @After("execution (* ru.itsjava.*.*.*(..))")
//    public void logAfter(JoinPoint joinPoint){
//        System.out.println("After Method:" + joinPoint.getSignature().getName());
//    }


    @Around("execution (* ru.itsjava.*.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Method:" + joinPoint.getSignature().getName());

        Object res = joinPoint.proceed();

        System.out.println("After Method:" + joinPoint.getSignature().getName());

        return res;
    }

}
