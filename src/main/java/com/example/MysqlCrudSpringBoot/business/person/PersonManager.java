package com.example.MysqlCrudSpringBoot.business.person;

import com.example.MysqlCrudSpringBoot.dataAccess.personRepository.PersonRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import com.example.MysqlCrudSpringBoot.entities.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class PersonManager implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonManager(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> persons() {
        return personRepository.findAll();
    }

    @Override
    public HttpStatus createPerson(Person person) {
       personRepository.save(person);
       return HttpStatus.OK;
    }
}
