package com.companyname.department.employeeservice.repository;

import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDAO, String> {
    EmployeeDAO findBy(String s);
}
