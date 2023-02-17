package com.companyname.department.employeeservice.repository;

import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDAO, String> {
    EmployeeDAO findByEmployeeID(String s);
    boolean deleteByEmployeeID(String s);

    @Override
    <S extends EmployeeDAO> S save(S entity);
}
