package com.companyname.department.employeeservice.configs.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutionTime{
    String userName() default "customAnnotation";
}
