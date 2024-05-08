package com.kafka.springkafka.controller;


import com.kafka.springkafka.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/location")
public class UpdateLocationController {


    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        return new ResponseEntity<>(new HashMap<>().put("message", "location retrieved"), OK);
    }
}
