package com.ls.security;

import com.ls.security.config.test.EnableImportStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableImportStudy
public class SpringSecurityBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicApplication.class, args);
    }

}
