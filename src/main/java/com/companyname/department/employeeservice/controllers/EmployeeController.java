package com.companyname.department.employeeservice.controllers;
import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import com.companyname.department.employeeservice.domain.models.ResponseWrapper;
import com.companyname.department.employeeservice.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PutMapping("/add/employee")
    public ResponseWrapper<String> addEmployee(EmployeeDAO employee) throws Exception {

        return new ResponseWrapper<>(HttpStatus.ACCEPTED.value(), null, "metaData", employeeService.addEmployee(employee));
    }

    @DeleteMapping("/remove/employee")
    public ResponseWrapper<String> removeEmployee(String employeeID){

        return new ResponseWrapper<>(HttpStatus.ACCEPTED.value(), null, "metaData", "T");
    }

    @PostMapping("/edit/employee")
    public ResponseWrapper<EmployeeDAO> editEmployee(EmployeeDAO employeeDAO){

        return new ResponseWrapper<>();
    }

    @GetMapping("/get/employee")
    public ResponseWrapper<EmployeeDAO> getEmployee(String employeeID) throws Exception {
        return new ResponseWrapper<>(HttpStatus.ACCEPTED.value(), null, "metaData", employeeService.getEmployee(employeeID));
    }
}
