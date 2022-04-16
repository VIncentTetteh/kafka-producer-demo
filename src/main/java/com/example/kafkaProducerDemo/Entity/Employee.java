package com.example.kafkaProducerDemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Employee {
    private  String id;
    private String name;
    private int age;

}
