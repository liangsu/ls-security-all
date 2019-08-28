package com.ls.security.config;

import com.ls.security.data.manager.AuthorityManager;
import com.ls.security.data.manager.UserManager;
import com.ls.security.data.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDetailService implements UserDetailsService {

    @Resource private UserManager userManager;
    @Resource private AuthorityManager authorityManager;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<User> users = userManager.getByAccount(username);
        if(CollectionUtils.isEmpty(users)){
            throw new UsernameNotFoundException("没找到用户");
        }
        User user = users.get(0);

        List<com.ls.security.data.entity.Authority> authorities = authorityManager.queryListByUserId(user.getId());

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(!CollectionUtils.isEmpty(authorities)){
            authorities.forEach(authority -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getCode());
                grantedAuthorities.add(grantedAuthority);
            });
        }

        org.springframework.security.core.userdetails.User securityUser =
                new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), grantedAuthorities);

        return securityUser;
    }

}
