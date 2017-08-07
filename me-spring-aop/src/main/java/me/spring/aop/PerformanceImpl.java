package me.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created on 2017/8/6.
 */
@Component("per")
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("zys在表演。。。");
    }
}
