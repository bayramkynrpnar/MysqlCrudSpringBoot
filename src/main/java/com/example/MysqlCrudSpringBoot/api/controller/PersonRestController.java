package com.example.MysqlCrudSpringBoot.api.controller;

import com.example.MysqlCrudSpringBoot.entities.Person;
import com.example.MysqlCrudSpringBoot.business.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
@Api(value = "/version/1/tutorials")
public class PersonRestController {
   @Autowired
    PersonService personService;



@GetMapping("/persons")
@ApiOperation(value = "Get Persons")
public ResponseEntity<List<Person>> persons(){
List<Person>persons = personService.persons();
return ResponseEntity.ok(persons);
}

@PostMapping("/createPerson")
@ApiOperation(value = "Create Person")
public HttpStatus createPerson(@RequestBody Person person){
     personService.createPerson(person);
     return HttpStatus.OK;
}
}
