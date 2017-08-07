package me.spring.context;

import me.spring.di.MediaPlayer;
import me.spring.di.java.CDPlayerJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import other.CompactDisc;
import other.Mp3Player;

/**
 * Created on 2017/8/6.
 */
public class SpringJavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerJavaConfig.class);
        MediaPlayer compactDisc = (MediaPlayer) applicationContext.getBean("cdPlayer");
        compactDisc.play();
    }
}
