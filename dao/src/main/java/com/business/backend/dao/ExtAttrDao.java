package com.business.backend.dao;

import com.business.backend.dao.domain.ExtAttr;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27 0027.
 */
public interface ExtAttrDao {
    /**
     * 新增
     * @param extAttr
     * @return
     */
    ExtAttr save(ExtAttr extAttr);

    /**
     * 根据businessKey删除多条记录
     * @param businessKey
     */
    void deleteByBusinessKey(Long businessKey);

    /**
     * 根据businessKey和name删除指定记录
     * @param businessKey
     * @param name
     */
    void deleteByBusinessKeyAndName(Long businessKey, String name);

    /**
     * 更新
     * @param extAttr
     */
    void update(ExtAttr extAttr);

    /**
     * 根据businessKey和name查找记录，然后修改value
     * @param businessKey
     * @param name
     * @param value
     */
    void updateValue(Long businessKey, String name, String value);

    /**
     * 根据主键查找所有扩展属性
     * @param businessKey
     * @return
     */
    List<ExtAttr> findByBusinessKey(Long businessKey);

    /**
     * 根据主键和name查找唯一记录
     * @param businessKey
     * @param name
     * @return
     */
    ExtAttr find(Long businessKey, String name);
}
