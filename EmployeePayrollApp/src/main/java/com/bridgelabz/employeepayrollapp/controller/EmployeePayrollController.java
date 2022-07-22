package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.DTO.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeePayrollController {
    @Autowired
    EmployeePayrollService employeePayrollService;

    @RequestMapping(value = {" ", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO responseDTO = new ResponseDTO("Success Call!!!", employeePayrollDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = {" ", "/get/{empID}"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int empID) {
        EmployeePayrollData employeePayrollData = employeePayrollService.getEmployeePayrollDataById(empID);
        ResponseDTO responseDTO = new ResponseDTO("Success Call for ID!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = {" ", "/add"})
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = employeePayrollService.addEmployeePayrollData(employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Data Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value = {" ", "/edit/{empID}"})
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int empID,
                                                                @Valid @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = employeePayrollService.updateEmployeeData(empID, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Updated Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = {" ", "/remove/{empID}"})
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable int empID) {
        employeePayrollService.deleteEmployeePayrollData(empID);
        ResponseDTO responseDTO = new ResponseDTO("Data Deleted Successfully!!!","Deleted ID: " + empID);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

