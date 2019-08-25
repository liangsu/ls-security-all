package com.ls.auth.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    private TokenStore tokenStore;

    @GetMapping(value = "/user/me", produces="application/json;charset=UTF-8")
    @ResponseBody
    public Principal user(Principal principal) {
        tokenStore.readAccessToken("");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return principal;
    }

    @GetMapping(value = "/user/me2", produces="application/json;charset=UTF-8")
    @ResponseBody
    public OAuth2AccessToken user2(@RequestParam("token") String token) {
        OAuth2AccessToken oAuth2AccessToken = tokenStore.readAccessToken(token);
        return oAuth2AccessToken;
    }

}
