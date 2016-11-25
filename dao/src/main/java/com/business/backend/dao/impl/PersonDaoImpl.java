package com.business.backend.dao.impl;

import com.business.backend.dao.PersonDao;
import com.business.backend.dao.domain.Person;
import com.business.backend.dao.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by willzhao on 2016/11/26 0026.
 */
@Component("personDao")
public class PersonDaoImpl implements PersonDao{
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findById(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
