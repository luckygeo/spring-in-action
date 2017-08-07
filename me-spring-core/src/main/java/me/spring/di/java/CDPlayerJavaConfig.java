package me.spring.di.java;

import me.spring.di.CDPlayer;
import me.spring.di.MediaPlayer;
import me.spring.di.SgtPeppers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import other.CompactDisc;
import other.Mp3Player;

/**
 * Created on 2017/8/6.
 */
@Configuration
public class CDPlayerJavaConfig {


    /*@Bean
    public CompactDisc mp3Player(){
        return new Mp3Player();
    }
    */
    @Bean
    public MediaPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    //注意此处的compactDisc 的引用和上一种引用是最佳选择，因为他不会要求将CompactDisc 声明到同一个配置类中，实际上
    // 他可以通过
    // <b>组件扫描或xml配置进行装配</b>，不管如何CompactDisc必须是由spring创建出来的
    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CompactDisc sgtPeppers(){
        return new Mp3Player();
    }
}
