package me.spring.context;

import me.spring.aop.AspectConfig;
import me.spring.aop.Audience;
import me.spring.aop.Performance;
import me.spring.aop.PerformanceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/8/6.
 */
public class AspectMain {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AspectConfig.class);
        Audience Audience = (Audience) applicationContext.getBean(Performance.class);
        Performance performance = (Performance) applicationContext.getBean("per");
        System.out.println(Audience.isAop);
        performance.perform();
        System.out.println(Audience.isAop);
    }
}
