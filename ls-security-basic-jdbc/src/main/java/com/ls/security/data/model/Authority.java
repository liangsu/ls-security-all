package com.ls.security.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * (DataAuthority)实体类
 *
 * @author makejava
 * @since 2019-08-28 20:39:54
 */
@TableName("DATA_USER")
public class Authority implements Serializable {
    private static final long serialVersionUID = -72423705620859465L;
    //主键
    @TableId(type = IdType.AUTO)
    private Integer id;
    //权限编码
    private String code;
    //权限名称
    private String name;
    //权限描述
    private String description;
    //权限路径
    private String url;
    //父权限ID
    private Integer parentId;
    //权限类型，1：菜单、2：功能
    private Object type;
    //排序索引
    private Integer sortNum;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

}