package com.ls.security.data.manager;

import com.ls.security.data.mapper.UserMapper;
import com.ls.security.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2019-08-28 20:26:55
 */
@Service
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    public User get(Integer id){
        return userMapper.selectById(id);
    }

    public List<User> getByAccount(String account){
        Map<String, Object> map = new HashMap<>();
        map.put("account", account);
        return userMapper.selectByMap(map);
    }

}