package com.bridgelabz.employeepayrollapp.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{1,}$",message = "Employee name can not be null")
    public String name;

    @Min(value = 500, message = "Salary should be more than 500")
    public int salary;

    public EmployeePayrollDTO(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}




