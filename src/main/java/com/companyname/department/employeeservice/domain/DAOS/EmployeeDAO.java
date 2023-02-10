package com.companyname.department.employeeservice.domain.DAOS;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class EmployeeDAO {

    public enum EmployeeType {
        FullTime, PartTime, Seasonal, Temporary
    }

    @NotBlank
    private String employeeFirstName;
    private String employeeMiddleName;
    @NotBlank
    private String employeeLastName;
    @NotBlank
    private String employeeID;
    private String department;
    @NotBlank
    private String location;
    private boolean remote;
}
