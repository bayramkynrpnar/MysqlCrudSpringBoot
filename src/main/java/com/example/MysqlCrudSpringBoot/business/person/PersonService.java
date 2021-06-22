package com.example.MysqlCrudSpringBoot.business.person;

import com.example.MysqlCrudSpringBoot.entities.person.Person;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PersonService {
    public List<Person> persons();
    public HttpStatus createPerson(Person person);
}
