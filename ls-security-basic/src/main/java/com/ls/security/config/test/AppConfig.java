package com.ls.security.config.test;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public User user(){
        return new User("admin");
    }

}
