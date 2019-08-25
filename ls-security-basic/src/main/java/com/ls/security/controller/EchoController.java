package com.ls.security.controller;

import com.ls.security.config.test.User;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/echo")
public class EchoController implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @RequestMapping(value = "/hello")
    public String hello(){
        String username = null;
        User user = null;
        try{
            user = applicationContext.getBean(User.class);
        }catch (BeansException be){
            be.printStackTrace();
        }

        if(user != null){
            username = user.getUserName();
        }else {
            username = "没有获取到用户名";
        }

        return "hello 123" + username;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
