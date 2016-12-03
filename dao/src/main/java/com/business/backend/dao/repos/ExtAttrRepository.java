package com.business.backend.dao.repos;

import com.business.backend.dao.domain.ExtAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by willzhao on 2016/11/27 0027 下午 11:54.
 * email : zq2599@gmail.com
 */
public interface ExtAttrRepository extends JpaRepository<ExtAttr, Long> {

    List<ExtAttr> findByBusinessKey(Long businessKey);

    List<ExtAttr> findByBusinessKeyAndName(Long businessKey, String name);

    ExtAttr save(ExtAttr extAttr);

    @Transactional
    @Modifying
    @Query("delete from ExtAttr e where e.businessKey=?1")
    void deleteByBusinessKey(Long businessKey);

    @Transactional
    @Modifying
    @Query("delete from ExtAttr e where e.businessKey=?1 and e.name=?2")
    void deleteByBusinessKeyAndName(Long businessKey, String name);

    @Transactional
    @Modifying
    @Query("update ExtAttr e set e.value=?3 where e.businessKey=?1 and e.name=?2")
    void updateValue(Long businessKey, String name, String value);
}