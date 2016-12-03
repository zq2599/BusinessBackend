package com.business.backend.dao.impl;

import com.business.backend.dao.domain.ExtAttr;
import com.business.backend.dao.ExtAttrDao;
import com.business.backend.dao.repos.ExtAttrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ExtAttr实体对应的Dao实现
 * Created by willzhao on 2016/11/27 0027 下午 11:47.
 * email : zq2599@gmail.com
 */
@Component("extAttrDao")
public class ExtAttrDaoImpl implements ExtAttrDao {
    @Autowired
    ExtAttrRepository extAttrRepository;

    @Override
    public List<ExtAttr> findByBusinessKey(Long businessKey) {
        return extAttrRepository.findByBusinessKey(businessKey);
    }

    @Override
    public ExtAttr find(Long businessKey, String name) {
        List<ExtAttr> list = extAttrRepository.findByBusinessKeyAndName(businessKey, name);

        if(null==list || list.isEmpty()){
            return null;
        }

        return list.get(0);
    }

    @Override
    public ExtAttr save(ExtAttr extAttr) {
        return extAttrRepository.save(extAttr);
    }

    @Override
    public void deleteByBusinessKey(Long businessKey) {
        extAttrRepository.deleteByBusinessKey(businessKey);
    }

    @Override
    public void deleteByBusinessKeyAndName(Long businessKey, String name) {
        extAttrRepository.deleteByBusinessKeyAndName(businessKey, name);
    }

    @Override
    public void update(ExtAttr extAttr) {
        extAttrRepository.save(extAttr);
    }

    @Override
    public void updateValue(Long businessKey, String name, String value) {
        extAttrRepository.updateValue(businessKey, name, value);
    }
}
