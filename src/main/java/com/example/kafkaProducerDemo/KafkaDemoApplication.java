package com.example.kafkaProducerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
//        return args -> {
//            for (int i = 0; i < 100; i++) {
//                kafkaTemplate.send("createEmployee","created Employee with ID: " + i);
//            }
//        };
//    }

}
