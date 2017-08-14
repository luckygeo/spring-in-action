package me.spring.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created on 2017/8/13.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.
                inMemoryAuthentication().withUser("user").password("user").roles("USER").and()
                .withUser("root").password("root").roles("ADMIN USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login")
                .and()
                .httpBasic()
                .realmName("h")
                .and()
                .authorizeRequests().antMatchers("/home/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/home/add").hasRole("ADMIN")
                .anyRequest().permitAll();
    }
}
