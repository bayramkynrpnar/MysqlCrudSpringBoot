package com.example.MysqlCrudSpringBoot.entities.image;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
@Data
@Document(collection = "Image")
@ApiModel(value = "Image Api Model",description = "model")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value = "id",required = true)
    private String id;

    @Column(name  = "images")
    @ApiModelProperty(value = "image",required = true)
    private String images;
}
