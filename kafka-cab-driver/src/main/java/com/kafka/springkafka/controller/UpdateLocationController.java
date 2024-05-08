package com.kafka.springkafka.controller;


import com.kafka.springkafka.service.UpdateLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/updatelocation")
public class UpdateLocationController {

    @Autowired
    private UpdateLocationService updateLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int i = 100;
        while(i>0) {
             updateLocationService.updateLocation(Math.random() +", "+Math.random());
             Thread.sleep(1000);
            i--;
        }
        return new ResponseEntity<>(new HashMap<>().put("message", "location updated"), OK);
    }
}
