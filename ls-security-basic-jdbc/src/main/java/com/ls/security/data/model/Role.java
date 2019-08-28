package com.ls.security.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 角色表(Role)实体类
 *
 * @author makejava
 * @since 2019-08-28 20:36:24
 */
@TableName("DATA_USER")
public class Role implements Serializable {
    private static final long serialVersionUID = 403603187102639015L;
    //主键
    @TableId(type = IdType.AUTO)
    private Integer id;
    //角色编码
    private String code;
    //角色名称
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}