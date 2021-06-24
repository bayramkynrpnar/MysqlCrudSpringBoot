package com.example.MysqlCrudSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.MysqlCrudSpringBoot.*"})
@EnableMongoRepositories("com.example.MysqlCrudSpringBoot.dataAccess.imageRepository")

public class MysqlCrudSpringBootApplication {
    public static void main(String[] args) {
       System.out.println(System.getenv("MYSQLHOST"));
        System.out.println(System.getenv("MYSQLPORT"));
        System.out.println(System.getenv("MONGODBHOST"));
        System.out.println(   System.getenv("MONGODBPORT"));


        SpringApplication.run(MysqlCrudSpringBootApplication.class, args);
    }
}
