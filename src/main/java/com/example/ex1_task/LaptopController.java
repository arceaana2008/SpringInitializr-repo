package com.example.ex1_task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LaptopController {
    @Value("${laptop.brand}")
    private String brand;

    @Value("${laptop.model}")
    private String model;

    @Value("${laptop.ram}")
    private String ram;

    @Value("${laptop.processor}")
    private String processor;

    @GetMapping("/laptop")
    public Map<String,String>getLaptopDetails(){
        Map<String,String>details=new HashMap<>();
        details.put("brand",brand);
        details.put("model",model);
        details.put("ram",ram);
        details.put("processor",processor);
        return details;

    }

}
