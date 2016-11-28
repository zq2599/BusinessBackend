package com.business.backend.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BizApplication {
    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }

    /*
    @RequestMapping(value = "/abc/{id}")
    @ResponseBody
    public String saveJpa(@PathVariable Long id){
        return "abc" + id;
    }
    */
   
}
