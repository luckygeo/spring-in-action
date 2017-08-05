package me.spring.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2017/8/5
 *
 */
@Configuration
@ComponentScan(basePackages = {"other","me.spring"})
//默认会扫描与配置类相同的包，查找包及其子包，发现带@component 的类，并且在spring创建bean
public class CDPlayerConfig {
}
