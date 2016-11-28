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

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }
    
   
   
}
