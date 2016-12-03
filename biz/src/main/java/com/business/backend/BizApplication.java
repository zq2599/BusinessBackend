package com.business.backend;

import com.business.backend.dao.PersonDao;
import com.business.backend.dao.domain.ExtAttr;
import com.business.backend.dao.domain.Person;
import com.business.backend.dao.ExtAttrDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@SpringBootApplication
@EnableJpaRepositories("com.business.backend.dao.repos")
public class BizApplication {

	@Autowired
	PersonDao personDao;

	@Autowired
	ExtAttrDao extAttrDao;

	@RequestMapping("/testjpa")
	@ResponseBody
	public List<com.business.backend.dao.domain.Person> getFromJpa(){
		List<com.business.backend.dao.domain.Person> list = personDao.findAll();
		return list;
	}

	@RequestMapping(value = "/find/{id}")
	@ResponseBody
	public Person saveJpa(@PathVariable Long id){
		return personDao.findById(id);
	}


	@RequestMapping(value = "/testextattr/{id}")
	@ResponseBody
	public List<ExtAttr> findExtAttr(@PathVariable Long id){
		return extAttrDao.findByBusinessKey(id);
	}

	@RequestMapping(value = "/testextattrsingle/{id}/{name}")
	@ResponseBody
	public ExtAttr findExtAttrName(@PathVariable Long id,@PathVariable String name){
		return extAttrDao.find(id, name);
	}

	@RequestMapping("/abc")
	public String test001(){
		return "index001";
	}

	@RequestMapping(value = "/testsaveext/{businessKey}/{name}/{value}")
	@ResponseBody
	public ExtAttr testSaveExt(@PathVariable Long businessKey,@PathVariable String name, @PathVariable String value){
		ExtAttr extAttr = new ExtAttr();
		extAttr.setBusinessKey(businessKey);
		extAttr.setCreateTime(System.currentTimeMillis());
		extAttr.setModifyTime(extAttr.getCreateTime());
		extAttr.setName(name);
		extAttr.setValue(value);
		return extAttrDao.save(extAttr);
	}

	@RequestMapping(value = "/testdelete/{businessKey}")
	@ResponseBody
	public String testDelete(@PathVariable Long businessKey){
		extAttrDao.deleteByBusinessKey(businessKey);
		return "success";
	}

	@RequestMapping(value = "/testupdatevalue/{businessKey}/{name}/{value}")
	@ResponseBody
	public String testUpdateValue(@PathVariable Long businessKey,@PathVariable String name, @PathVariable String value){
		extAttrDao.updateValue(businessKey, name, value);
		return "success";
	}

	@RequestMapping(value = "/testupdate/{busnessKey}/{name}/{type}")
	@ResponseBody
	public String testDelete(@PathVariable Long busnessKey, @PathVariable String name, @PathVariable String type){
		ExtAttr extAttr = extAttrDao.find(busnessKey, name);

		if(null==extAttr){
			return "record not found";
		}else{
			extAttr.setType(type);
			extAttrDao.update(extAttr);
			return "success";
		}
	}

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }
    
   
   
}
