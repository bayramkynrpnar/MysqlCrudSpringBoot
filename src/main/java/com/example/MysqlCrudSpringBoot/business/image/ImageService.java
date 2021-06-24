package com.example.MysqlCrudSpringBoot.business.image;

import com.example.MysqlCrudSpringBoot.entities.image.Image;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface ImageService {
    List<Image> getAllImages();
    HttpStatus createImage(Image image);
}
