package com.business.backend.controller;

import com.business.backend.dao.BaseStockDao;
import com.business.backend.dao.domain.BaseStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

	@RequestMapping("/list")
	public String list(Model model){
		return doList(model);
	}

	private String doList(Model model){
		List<BaseStock> list =baseStockDao.findAll();

		if(null==list){
			list = new ArrayList<>();
		}

		model.addAttribute("list", list);
		model.addAttribute("list_tag", "from stock controller");

		return "stock/stock_list";
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

	@RequestMapping(value = "/savepost")
	public String savePost(@RequestParam("stockName") String stockName, @RequestParam("stockType") String stockType, @RequestParam("maxValue") Long maxValue, Model model){
		BaseStock baseStock = new BaseStock();
		baseStock.setCreateTime(System.currentTimeMillis());
		baseStock.setModifyTime(System.currentTimeMillis());
		baseStock.setName(stockName);
		baseStock.setType(stockType);
		baseStock.setMaxValue(maxValue);
		baseStock.setStockValue(maxValue);
		baseStockDao.save(baseStock);
		return doList(model);
	}
}
