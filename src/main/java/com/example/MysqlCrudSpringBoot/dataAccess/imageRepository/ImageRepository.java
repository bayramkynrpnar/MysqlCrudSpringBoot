package com.example.MysqlCrudSpringBoot.dataAccess.imageRepository;

import com.example.MysqlCrudSpringBoot.entities.image.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends MongoRepository<Image,String> {

}
