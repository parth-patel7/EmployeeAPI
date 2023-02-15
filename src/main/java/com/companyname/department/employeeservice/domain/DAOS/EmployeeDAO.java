package com.companyname.department.employeeservice.domain.DAOS;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


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
