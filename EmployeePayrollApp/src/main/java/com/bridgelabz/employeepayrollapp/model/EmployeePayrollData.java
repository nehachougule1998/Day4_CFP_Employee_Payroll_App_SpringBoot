package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollData {
    private int employeeID;
    private String name;
    private int salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String> department;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = empID;
        this.name = employeePayrollDTO.getName();
        this.salary = employeePayrollDTO.getSalary();
        this.gender = employeePayrollDTO.getGender();
        this.note = employeePayrollDTO.getNote();
        this.startDate = employeePayrollDTO.getStartDate();
        this.profilePic = employeePayrollDTO.getProfilePic();
        this.department = employeePayrollDTO.getDepartment();
    }
}