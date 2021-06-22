package com.example.MysqlCrudSpringBoot.business.image;

import com.example.MysqlCrudSpringBoot.entities.image.Image;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface ImageService {
    public List<Image> getAllImages();
    public HttpStatus createImage(Image image);
}
