package com.business.backend.dao.repos;

import com.business.backend.dao.domain.BaseStock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by willzhao on 2016/11/27 0027 下午 11:54.
 * email : zq2599@gmail.com
 */
public interface BaseStockRepository extends JpaRepository<BaseStock, Long> {

}