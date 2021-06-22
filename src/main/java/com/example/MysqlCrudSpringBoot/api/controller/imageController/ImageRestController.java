package com.example.MysqlCrudSpringBoot.api.controller.imageController;

import com.example.MysqlCrudSpringBoot.business.image.ImageService;
import com.example.MysqlCrudSpringBoot.entities.image.Image;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "/version/1/tutorials")
public class ImageRestController {
    private ImageService imageService;

    @Autowired
    public ImageRestController(ImageService imageService) {
        this.imageService = imageService;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "addImage")
    public HttpStatus addImage(@RequestBody Image image){
            imageService.createImage(image);


            return HttpStatus.OK;
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ApiOperation(value = "getAllImage")
    public List<Image> getAllImage(){
        return imageService.getAllImages();
    }
}
