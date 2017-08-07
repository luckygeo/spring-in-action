package me.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created on 2017/8/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectConfig.class)
public class PerformanceImplTest {
    @Autowired
    private Performance performance;

    @Autowired
    private Audience audience;

    @Test
    public void perform() throws Exception {
        performance.perform();
        System.out.println(audience.isAop);
    }

}