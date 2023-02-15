package com.companyname.department.employeeservice.domain.models;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseWrapper<T>{

    @NotBlank
    private int code;
    private List<Message> response;
    private String meta;
    @Nullable
    private T data;
}
