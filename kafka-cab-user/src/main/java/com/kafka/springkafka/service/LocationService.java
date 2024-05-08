package com.kafka.springkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.kafka.springkafka.constant.AppConstants.LOCATION_OF_CAB;

@Service
public class LocationService {


    @KafkaListener(groupId = "user-group", topics = LOCATION_OF_CAB)
    public void location(String location) {
        System.out.println(location);

    }
}
