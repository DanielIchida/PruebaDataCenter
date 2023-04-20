package com.datacenter.recargas.services;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.exeptions.ErrorReaderDatabaseException;
import com.datacenter.recargas.repositories.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FindAllOperators {

    @Autowired
    private OperatorRepository operatorRepository;

    public ResponseDTO execute() {
        try {
             return new ResponseDTO(HttpStatus.OK,"OK",null,operatorRepository.findAll());
        } catch (Exception ex) {
            throw new ErrorReaderDatabaseException(ex);
        }
    }

}
