package com.example.MysqlCrudSpringBoot.dataAccess.personRepository;

import com.example.MysqlCrudSpringBoot.entities.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
