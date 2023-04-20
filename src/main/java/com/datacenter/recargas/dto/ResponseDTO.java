package com.datacenter.recargas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDTO {

    private HttpStatus status;
    private String message;
    private String error;
    private Object result;

}
