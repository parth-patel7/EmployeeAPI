package com.companyname.department.employeeservice.configs;

import com.companyname.department.employeeservice.domain.models.Message;
import com.companyname.department.employeeservice.domain.models.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Collections;

@ControllerAdvice
@Slf4j
public class GlobalExceptionalHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object handleException(Exception exception){
        log.error("Exception occurred with error: " + exception.getCause());
        return new ResponseWrapper<>(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                Collections.singletonList(new Message("5000", "Internal Server Error", exception.getCause().toString())),
                null,
                null);
    }

    @ExceptionHandler(BindException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object invalidRequest(BindException exception){
        log.error("Exception occurred with error: " + exception.getCause());
        return new ResponseWrapper<>(
                HttpStatus.BAD_REQUEST.value(),
                Collections.singletonList(new Message("4000", "The request is missing required fields.", exception.getMessage())),
                null,
                null);
    }
}
