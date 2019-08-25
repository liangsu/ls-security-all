package com.ls.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);

//        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
//        System.out.println(b.encode("secret")); // $2a$10$a45uBdrYHJSmTUiQaqEJI.2uQkudjKNc/H7nc0wbCFh2I8oUnlP5y
    }

}
