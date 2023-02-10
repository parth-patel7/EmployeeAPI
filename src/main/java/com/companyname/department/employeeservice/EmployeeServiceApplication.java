package com.companyname.department.employeeservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication(scanBasePackageClasses = {EmployeeServiceInitializer.class}, exclude = RabbitAutoConfiguration.class)
@Slf4j
public class EmployeeServiceApplication implements ApplicationRunner {
    public static void main(String[] args){
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
