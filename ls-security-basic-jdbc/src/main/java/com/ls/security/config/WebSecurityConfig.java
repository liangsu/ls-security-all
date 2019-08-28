package com.ls.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserDetailService userDetailService;
    @Resource
    private AccessDecisionManager accessDecisionManager;

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/user/get/*").hasAuthority("AA")
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic();

        http.userDetailsService(userDetailService);
//        http.authorizeRequests().accessDecisionManager(accessDecisionManager);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
//        123： $2a$10$Edjls4WU0TSQDnj1t8FzeO9soPgEjIDHqZG.4Dinyta/p.qfowlvq
        return new BCryptPasswordEncoder();
    }

}
