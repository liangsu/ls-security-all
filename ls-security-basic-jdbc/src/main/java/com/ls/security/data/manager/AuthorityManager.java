package com.ls.security.data.manager;

import com.ls.security.data.mapper.AuthorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户表(Authority)表服务接口
 *
 * @author makejava
 * @since 2019-08-28 20:26:55
 */
@Service
public class AuthorityManager {

    @Autowired
    private AuthorityMapper AuthorityMapper;

    public List<com.ls.security.data.entity.Authority> queryListByUserId(Integer userId){
        return AuthorityMapper.queryListByUserId(userId);
    }

}