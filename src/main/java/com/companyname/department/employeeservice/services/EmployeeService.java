package com.companyname.department.employeeservice.services;

import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import com.companyname.department.employeeservice.domain.models.ResponseWrapper;
//import com.companyname.department.employeeservice.repository.CRUDRepository;
import com.companyname.department.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String addEmployee(EmployeeDAO employeeDAO) throws Exception {
        return "";
    }

    public ResponseWrapper<EmployeeDAO> editEmployee(EmployeeDAO employeeDAO){
        return null;
    }

    public EmployeeDAO deleteEmployee(String employeeID){
//        EmployeeDAO employee = employeeRepository.findBy(employeeID);
//        employeeRepository.delete(employee);
        return null;
    }

    public EmployeeDAO getEmployee(String employeeID) throws Exception {
//        EmployeeDAO employeeDAO = employeeRepository.findBy(employeeID);
//        if(employeeDAO == null){
//            throw new Exception("");
//        }
        return null;
    }
}
