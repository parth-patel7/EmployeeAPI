package com.companyname.department.employeeservice.controllers;
import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import com.companyname.department.employeeservice.domain.models.ResponseWrapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @PutMapping("/add/employee")
    public ResponseWrapper addEmployee(EmployeeDAO employeeDAO){

        return new ResponseWrapper();
    }
}
