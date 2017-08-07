package me.spring.aop;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/8/6.
 */

@Aspect
public class Audience {

    @Pointcut("execution(public * me.spring.aop.Performance.perform(..))")
    public void performance() {

    }

    public boolean isAop = false;

    @Before("performance()")
    public void silenceCellPhones() {
        this.isAop = true;
        System.out.println("Silence cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning(pointcut = "performance()")
    public void applause(){
        System.out.println("CLAP CLAP..");
    }

    @AfterThrowing(pointcut = "performance()")
    public void demandRefund(){
        System.out.println("异常。。。");
    }
}
