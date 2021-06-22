package com.example.MysqlCrudSpringBoot.business;

import com.example.MysqlCrudSpringBoot.entities.Person;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PersonService {
    public List<Person> persons();
    public HttpStatus createPerson(Person person);
}
