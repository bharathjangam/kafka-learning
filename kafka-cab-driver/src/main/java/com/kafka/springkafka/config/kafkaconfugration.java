package com.kafka.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.kafka.springkafka.constant.AppConstants.LOCATION_OF_CAB;

@Configuration
public class kafkaconfugration
{
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(LOCATION_OF_CAB).build();
    }
}
