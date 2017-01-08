package com.business.backend.dao;

import com.business.backend.dao.domain.BaseStock;

import java.util.List;

/**
 * 基础库存表对于的dao接口
 * Created by willzhao on 2016/12/18 1112.
 */
public interface BaseStockDao {
    /**
     * 新增
     * @param baseStock
     * @return
     */
    BaseStock save(BaseStock baseStock);

    /**
     * 根据id删除多条记录
     * @param id
     */
    void delete(Long id);

    /**
     * 更新
     * @param baseStock
     */
    void update(BaseStock baseStock);

    /**
     * 根据id查找记录
     * @param id
     * @return
     */
    BaseStock find(Long id);

    /**
     * 查找所有库存对象
     * @return
     */
    List<BaseStock> findAll();
}
