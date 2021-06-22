package com.example.MysqlCrudSpringBoot.business.image;

import com.example.MysqlCrudSpringBoot.dataAccess.imageRepository.ImageRepository;
import com.example.MysqlCrudSpringBoot.dataAccess.personRepository.PersonRepository;
import com.example.MysqlCrudSpringBoot.entities.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageManager implements ImageService {
    private ImageRepository imageRepository;

    @Autowired
    public ImageManager(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public HttpStatus createImage(Image image) {
        imageRepository.save(image);
        return HttpStatus.OK;
    }
}
