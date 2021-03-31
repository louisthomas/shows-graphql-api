package com.demo.showsgraphqlapi;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable();
        http.authorizeRequests().antMatchers("/actuator/**").permitAll()
                .and()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .oauth2ResourceServer().jwt();
    }
}