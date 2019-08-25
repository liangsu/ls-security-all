package com.ls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "hello")
    public String hello(Principal principal){
        return "hello resource server" + principal;
    }
}
