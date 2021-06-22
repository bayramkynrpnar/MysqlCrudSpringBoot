package com.example.MysqlCrudSpringBoot.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="person")
@ApiModel(value = "Person Api Model", description = "model")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value = "unique id",required = true)
    public int id;
    @Column(name = "name")
    @ApiModelProperty(value = "name field",required = true)
    public String name;
    @Column(name = "surname")
    @ApiModelProperty(value = "surname field",required = true)
    public String surname;



}
