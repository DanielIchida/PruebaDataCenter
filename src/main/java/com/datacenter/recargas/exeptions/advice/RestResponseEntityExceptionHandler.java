package com.datacenter.recargas.exeptions.advice;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.exeptions.ErrorReaderDatabaseException;
import com.datacenter.recargas.exeptions.ExceedAmountException;
import com.datacenter.recargas.exeptions.NoExitsElementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ExceedAmountException.class, NoExitsElementException.class})
    protected ResponseEntity<ResponseDTO> handleWarn(RuntimeException ex, WebRequest webRequest) {
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.CONFLICT,"WARN", ex.getMessage(),null);
        return ResponseEntity.status(responseDTO.getStatus()).body(responseDTO);
    }

    @ExceptionHandler(value = {ErrorReaderDatabaseException.class, ErrorReaderDatabaseException.class})
    protected ResponseEntity<ResponseDTO> handleError(RuntimeException ex, WebRequest webRequest) {
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR,"ERROR", ex.getMessage(),null);
        return ResponseEntity.status(responseDTO.getStatus()).body(responseDTO);
    }

}
