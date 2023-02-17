package com.companyname.department.employeeservice.services;

import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import com.companyname.department.employeeservice.domain.models.ResponseWrapper;
import com.companyname.department.employeeservice.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String addEmployee(EmployeeDAO employeeDAO) throws Exception {
        // Check if exists
        employeeRepository.save(employeeDAO);
        return "";
    }

    public ResponseWrapper<EmployeeDAO> editEmployee(EmployeeDAO employeeDAO){
        return null;
    }

    public void deleteEmployee(String employeeID) throws Exception {
        if(!employeeRepository.deleteByEmployeeID(employeeID)){
            throw new Exception("Employee with ID: " + employeeID + " not found.");
        }
    }

    public EmployeeDAO getEmployee(String employeeID) throws Exception {
        EmployeeDAO employeeDAO = employeeRepository.findByEmployeeID(employeeID);
        if(employeeDAO == null){
            throw new Exception("Employee with ID: " + employeeID + " not found.");
        }
        return null;
    }
}
