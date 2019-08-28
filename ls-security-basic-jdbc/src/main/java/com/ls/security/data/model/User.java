package com.ls.security.data.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 用户表(DataUser)实体类
 *
 * @author makejava
 * @since 2019-08-28 20:26:48
 */
@TableName("DATA_USER")
public class User implements Serializable {
    //主键
    @TableId(type = IdType.AUTO)
    private Integer id;
    //用户名
    private String name;
    //登录账号
    private String account;
    //密码
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}