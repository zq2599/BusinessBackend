package com.business.backend.dao.repos;

import com.business.backend.dao.domain.ExtAttr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by willzhao on 2016/11/27 0027 下午 11:54.
 * email : zq2599@gmail.com
 */
public interface ExtAttrRepository extends JpaRepository<ExtAttr, Long> {

    List<ExtAttr> findByBusinessKey(Long businessKey);

    List<ExtAttr> findByBusinessKeyAndName(Long businessKey, String name);

    ExtAttr save(ExtAttr extAttr);
}