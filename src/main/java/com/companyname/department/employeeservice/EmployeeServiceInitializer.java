package com.companyname.department.employeeservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application){
        Map<String, Object> map = new HashMap<>();
        return application.sources(EmployeeServiceApplication.class).properties(map);
    }
}
