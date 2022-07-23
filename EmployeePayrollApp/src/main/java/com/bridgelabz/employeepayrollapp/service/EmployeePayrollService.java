package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeePayrollService {

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;
    List<EmployeePayrollData> employeeDataList = new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeDataList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empID) {
        return employeeDataList.get(empID-1);
    }

    public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(employeeDataList.size()+1, employeePayrollDTO);
        employeeDataList.add(employeePayrollData);
        return employeePayrollData;
    }

    public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empID);
        employeePayrollData.setName(employeePayrollDTO.getName());
        employeePayrollData.setSalary(employeePayrollDTO.getSalary());
        employeeDataList.set(empID-1, employeePayrollData);
        return employeePayrollData;
    }

    public void deleteEmployeePayrollData(int empID) {
        employeeDataList.remove(empID-1);
    }

}

