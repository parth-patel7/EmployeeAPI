package com.companyname.department.employeeservice.domain.DAOS;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Data
@Entity
public class EmployeeDAO {


    @NotBlank
    private String employeeFirstName;
    private String employeeMiddleName;
    @NotBlank
    private String employeeLastName;
    @NotBlank @Id
    private String employeeID;
    @NotBlank
    private String employeeEmailID;
    private String department;
    @NotBlank
    private String location;
    private boolean remote;
}
