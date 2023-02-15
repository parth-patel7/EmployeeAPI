package com.companyname.department.employeeservice;

import com.companyname.department.employeeservice.domain.DAOS.EmployeeDAO;
import com.companyname.department.employeeservice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(scanBasePackageClasses = {EmployeeServiceInitializer.class}, exclude = {RabbitAutoConfiguration.class,DataSourceAutoConfiguration.class})
@Slf4j
//@EntityScan(basePackageClasses = EmployeeDAO.class)
//@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)
//@Configuration
@SpringBootApplication
public class EmployeeServiceApplication implements ApplicationRunner {
    public static void main(String[] args){
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
