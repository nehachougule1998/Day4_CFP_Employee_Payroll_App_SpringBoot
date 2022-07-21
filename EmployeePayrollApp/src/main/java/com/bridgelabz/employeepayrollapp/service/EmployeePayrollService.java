package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService {
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeeDataList = new ArrayList<>();
        employeeDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Nilofar", 1000)));
        return employeeDataList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empID) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(empID, new EmployeePayrollDTO("Anushka", 5000));
        return employeePayrollData;
    }

    public EmployeePayrollData addEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(2, employeePayrollDTO);
        return employeePayrollData;
    }

    public EmployeePayrollData updateEmployeeData(int empID, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(empID, employeePayrollDTO);
        return employeePayrollData;
    }

    public void deleteEmployeePayrollData(int empID) {

    }

}