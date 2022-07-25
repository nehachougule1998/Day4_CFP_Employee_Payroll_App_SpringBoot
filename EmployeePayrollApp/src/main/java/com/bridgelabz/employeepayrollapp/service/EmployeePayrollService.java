package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService {

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empID) {
        return employeePayrollRepository.findById(empID)
                .orElseThrow(() -> new EmployeePayrollException("Employee Id not Found!!!"));
    }

    public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
        return employeePayrollRepository.save(employeePayrollData);
    }

    public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        employeePayrollData.updateData(employeePayrollDTO);
        return employeePayrollRepository.save(employeePayrollData);
    }

    public void deleteEmployeePayrollData(int empID) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
       employeePayrollRepository.delete(employeePayrollData);
    }

    public List<EmployeePayrollData> getEmployeeByDepartment(String department) {
        return employeePayrollRepository.findEmployeeByDepartment(department);
    }

}

