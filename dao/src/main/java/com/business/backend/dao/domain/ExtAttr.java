package com.business.backend.dao.domain;

import javax.persistence.*;

/**
 * 通用主从表的扩展属性表对应的entity
 * Created by willzhao on 2016/11/24 0024.
 */

@Entity
@Table(name = "ext_attr")
public class ExtAttr {
    @Id
    @GeneratedValue
    private Long id;


    public Long getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(Long businessKey) {
        this.businessKey = businessKey;
    }

    @Column(name = "main_id")
    private Long businessKey;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "modify_time")
    private Long modifyTime;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private String value;

    @Column(name = "type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
