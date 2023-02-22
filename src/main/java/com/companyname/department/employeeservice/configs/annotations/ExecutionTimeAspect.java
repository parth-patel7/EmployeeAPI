package com.companyname.department.employeeservice.configs.annotations;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAspect {

    @Around("@annotation(ExecutionTime)")
    public Object logProcessingTime(ProceedingJoinPoint proceedingJoinPoint, ExecutionTime ExecutionTime) throws Throwable {
        if(Objects.isNull(ExecutionTime)){
            throw new IllegalStateException("Please pass the value");
        }
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        log.info("Hello from our custom annotation - " + ExecutionTime.userName());
        log.info("Processing Time for userName " + ExecutionTime.userName() + ": "+ (System.currentTimeMillis() - startTime) + " milliseconds with thread: "+ Thread.currentThread().getId());
        return result;
    }
}
