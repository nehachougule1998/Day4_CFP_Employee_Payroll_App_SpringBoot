package com.bridgelabz.employeepayrollapp.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
@Data
public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee firstName is Invalid")
    private String name;

    @Min(value = 500, message = "Salary should be more than 500")
    private int salary;

    @Pattern(regexp = "female|male ", message = "Gender needs to be male or female")
    private String gender;

    @JsonFormat(pattern = "dd MM yyyy")
    @NotNull(message = "startDate should Not be Empty")
    @PastOrPresent(message = "startDate should be past or present date")
    public LocalDate startDate;
    private String note;

    @NotEmpty(message = "ProfilePic cannot be null")
    private String profilePic;

    @NotEmpty(message = "Department name cannot be null")
    private List<String> department;

    public EmployeePayrollDTO() {
        super();
    }
}

