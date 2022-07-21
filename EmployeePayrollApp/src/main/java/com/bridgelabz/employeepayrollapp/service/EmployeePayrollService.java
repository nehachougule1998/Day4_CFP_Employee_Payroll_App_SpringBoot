package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {
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
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeeDataList.set(empID-1, employeePayrollData);
        return employeePayrollData;
    }

    public void deleteEmployeePayrollData(int empID) {
        employeeDataList.remove(empID-1);
    }

}

