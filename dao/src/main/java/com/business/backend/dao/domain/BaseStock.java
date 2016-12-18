package com.business.backend.dao.domain;

import javax.persistence.*;

/**
 * 基础库存表对应的entity
 * Created by willzhao on 2016/12/18 1105.
 */

@Entity
@Table(name = "base_stock")
public class BaseStock {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "modify_time")
    private Long modifyTime;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "max_value")
    private Long maxValue;

    @Column(name = "stock_value")
    private Long stockValue;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public Long getStockValue() {
        return stockValue;
    }

    public void setStockValue(Long stockValue) {
        this.stockValue = stockValue;
    }
}
