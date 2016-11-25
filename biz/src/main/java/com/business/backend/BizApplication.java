package com.business.backend;

import com.business.backend.dao.PersonDao;
import com.business.backend.dao.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@SpringBootApplication
@EnableJpaRepositories("com.business.backend.dao.repos")
public class BizApplication {

	@Autowired
	PersonDao personDao;

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

	@RequestMapping("/abc")
	public String test001(){
		return "index001";
	}

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }
    
   
   
}
