package com.example.MysqlCrudSpringBoot.api.controller.imageController;

import com.example.MysqlCrudSpringBoot.business.image.ImageService;
import com.example.MysqlCrudSpringBoot.entities.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/images")
public class ImageRestController {
    private ImageService imageService;

    @Autowired
    public ImageRestController(ImageService imageService) {
        this.imageService = imageService;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpStatus addImage(@RequestBody Image image){
            imageService.createImage(image);


            return HttpStatus.OK;
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Image> getAllImage(){
        return imageService.getAllImages();
    }
}
