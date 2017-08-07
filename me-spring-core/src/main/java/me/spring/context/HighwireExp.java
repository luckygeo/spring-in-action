package me.spring.context;

import me.spring.highwire.ExpressiveConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import other.BlankDisc;

/**
 * Created on 2017/8/6.
 */
public class HighwireExp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ExpressiveConfig.class);
        BlankDisc blankDisc = (BlankDisc) applicationContext.getBean("blankDisc");
        blankDisc.play();
        applicationContext.close();
    }
}
