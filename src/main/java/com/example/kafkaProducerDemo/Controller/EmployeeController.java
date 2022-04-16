package com.example.kafkaProducerDemo.Controller;

import com.example.kafkaProducerDemo.Entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    KafkaTemplate<String, String> kafkaTemplate;
    ObjectMapper objectMapper = new ObjectMapper();

    public EmployeeController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/create")
    public String createEmployee( @RequestBody Employee employee) throws JsonProcessingException {
        kafkaTemplate.send("createEmployee",objectMapper.writeValueAsString(employee));
        return "employee with name: " + employee + " created and publish";
    }
}
