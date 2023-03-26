package com.je.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return new String("user service fetch is taking longer than expected. Please try later");
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return new String("Department service fetch is taking longer than expected. Please try later");
    }
}
