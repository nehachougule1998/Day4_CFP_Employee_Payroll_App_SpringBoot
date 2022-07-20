package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayrollController {
    @GetMapping("/hello")
    public String getMessage(){
        return "Hello World";
    }
}