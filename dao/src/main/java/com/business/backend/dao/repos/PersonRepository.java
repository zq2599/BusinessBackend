package com.business.backend.dao.repos;

import com.business.backend.dao.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2016/11/24 0024.
 */
public interface PersonRepository extends JpaRepository<Person, Long>{

    List<Person> findByName(String name);

    Person save(Person person);


}
