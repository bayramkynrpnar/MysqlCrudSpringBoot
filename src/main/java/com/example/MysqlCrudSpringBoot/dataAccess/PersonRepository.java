package com.example.MysqlCrudSpringBoot.dataAccess;

import com.example.MysqlCrudSpringBoot.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
