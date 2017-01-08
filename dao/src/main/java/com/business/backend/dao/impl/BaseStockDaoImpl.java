package com.business.backend.dao.impl;

import com.business.backend.dao.BaseStockDao;
import com.business.backend.dao.domain.BaseStock;
import com.business.backend.dao.domain.ExtAttr;
import com.business.backend.dao.repos.BaseStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ExtAttr实体对应的Dao实现
 * Created by willzhao on 2016/12/18 1115.
 * email : zq2599@gmail.com
 */
@Component("baseStockDao")
public class BaseStockDaoImpl implements BaseStockDao {
    @Autowired
    BaseStockRepository baseStockRepository;

    @Override
    public BaseStock save(BaseStock baseStock) {
        return baseStockRepository.save(baseStock);
    }

    @Override
    public void delete(Long id) {
        baseStockRepository.delete(id);
    }

    @Override
    public void update(BaseStock baseStock) {
        baseStockRepository.save(baseStock);
    }

    @Override
    public BaseStock find(Long id) {
        return baseStockRepository.findOne(id);
    }

    @Override
    public List<BaseStock> findAll() {
        return baseStockRepository.findAll();
    }
}
