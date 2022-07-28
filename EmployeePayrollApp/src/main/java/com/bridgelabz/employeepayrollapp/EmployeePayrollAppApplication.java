package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll Application Started in {} Environment",
                context.getEnvironment().getProperty("environment"));
        System.out.println("Welcome to Employee Payroll Application.");
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}