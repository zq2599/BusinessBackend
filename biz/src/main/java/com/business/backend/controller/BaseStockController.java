package com.business.backend.controller;

import com.business.backend.dao.BaseStockDao;
import com.business.backend.dao.domain.BaseStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基础库存业务相关的controller
 */
@Controller
@RequestMapping("/stock")
public class BaseStockController {

	@Autowired
	BaseStockDao baseStockDao;

	@RequestMapping(value = "/dotest")
	@ResponseBody
	public String test(){
		return "123456";
	}

	@RequestMapping("/create")
	public String test001(){
		return "stock/create_stock";
	}

	@RequestMapping(value = "/save/{name}/{type}/{num}")
	@ResponseBody
	public BaseStock save(@PathVariable String name, @PathVariable String type, @PathVariable long num){
		BaseStock baseStock = new BaseStock();
		baseStock.setCreateTime(System.currentTimeMillis());
		baseStock.setModifyTime(System.currentTimeMillis());
		baseStock.setName(name);
		baseStock.setType(type);
		baseStock.setMaxValue(num);
		baseStock.setStockValue(num);
		return baseStockDao.save(baseStock);
	}
}
