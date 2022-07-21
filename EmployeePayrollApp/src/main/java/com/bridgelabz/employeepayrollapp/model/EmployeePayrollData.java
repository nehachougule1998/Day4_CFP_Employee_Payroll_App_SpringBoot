package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import lombok.Data;

@Data
public class EmployeePayrollData {
    private int employeeID;
    private String name;
    private int salary;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = empID;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

}
