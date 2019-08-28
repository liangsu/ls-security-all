package com.ls.security.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.security.data.model.User;

import java.util.List;

public interface AuthorityMapper extends BaseMapper<User> {

    List<com.ls.security.data.entity.Authority> queryListByUserId(Integer userId);

}
