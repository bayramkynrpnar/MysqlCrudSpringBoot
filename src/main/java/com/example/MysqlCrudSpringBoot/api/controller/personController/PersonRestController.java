package com.example.MysqlCrudSpringBoot.api.controller.personController;

import com.example.MysqlCrudSpringBoot.entities.person.Person;
import com.example.MysqlCrudSpringBoot.business.person.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")


public class PersonRestController {

    private PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    @ApiOperation(value = "Get Persons")
    public ResponseEntity<List<Person>> persons() {
        List<Person> persons = personService.persons();
        return ResponseEntity.ok(persons);
    }

    @PostMapping("/createPerson")
    @ApiOperation(value = "Create Person")
    public HttpStatus createPerson(@RequestBody Person person) {
        personService.createPerson(person);
        return HttpStatus.OK;
    }
}
