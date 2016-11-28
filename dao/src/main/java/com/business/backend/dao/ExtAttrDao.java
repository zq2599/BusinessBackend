package com.business.backend.dao;

import com.business.backend.dao.domain.ExtAttr;

import java.util.List;

/**
 * Created by Administrator on 2016/11/27 0027.
 */
public interface ExtAttrDao {

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

    /**
     * 新增
     * @param extAttr
     * @return
     */
    ExtAttr save(ExtAttr extAttr);
}
