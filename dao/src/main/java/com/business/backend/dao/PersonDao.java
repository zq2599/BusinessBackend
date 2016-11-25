package com.business.backend.dao;

import com.business.backend.dao.domain.Person;

import java.util.List;

/**
 * 用户主表相关的DAO接口
 * Created by willzhao on 2016/11/26 0026.
 */
public interface PersonDao {
    /**
     * 通过主键获取对象
     * @param id
     * @return
     */
    Person findById(Long id);

    /**
     * 新增一条记录
     * @param person
     * @return
     */
    Person create(Person person);

    /**
     * 获取所有记录
     * @return
     */
    List<Person> findAll();

}
