package me.spring.highwire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import other.BlankDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/8/6.
 */
@Configuration
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
//设置utf-8 但不明白为什么不设置PropertySourcesPlaceholderConfigurer  也可使用占位符号
//@ImportResource("classpath:spring-properties.xml")
public class ExpressiveConfig {
    @Autowired
    private Environment env;

    //@Bean
    //public BlankDisc blankDisc(){
    //    BlankDisc blankDisc = new BlankDisc();
    //    blankDisc.setArtist(env.getProperty("disc.artist"));
    //    blankDisc.setTitle(env.getProperty("disc.title"));
    //    List<String> list = new ArrayList<>();
    //    list.add("歌曲1");
    //    list.add("歌曲2");
    //    blankDisc.setTracks(list);
    //    return blankDisc;
    //}
    //@Bean
    //public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
    //    PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
    //    configurer.setFileEncoding("UTF-8");
    //    return configurer;
    //}

    @Bean
    public BlankDisc blankDisc(@Value("#{systemProperties['disc.title']}") String title, @Value("${disc.artist}") String artist) {
        return new BlankDisc(title, artist);
    }
}
