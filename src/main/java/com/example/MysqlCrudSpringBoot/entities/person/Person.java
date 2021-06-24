package com.example.MysqlCrudSpringBoot.entities.person;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public int id;
    @Column(name = "name")
    @ApiModelProperty(value = "name field",required = true)
    public String name;
    @Column(name = "surname")
    @ApiModelProperty(value = "surname field",required = true)
    public String surname;



}
