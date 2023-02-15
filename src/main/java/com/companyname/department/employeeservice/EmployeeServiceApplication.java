package com.companyname.department.employeeservice;

import com.companyname.department.employeeservice.repository.RepositoryScanClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@EnableJpaRepositories(basePackageClasses = RepositoryScanClass.class)
@SpringBootApplication
public class EmployeeServiceApplication implements ApplicationRunner {
    public static void main(String[] args){
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
