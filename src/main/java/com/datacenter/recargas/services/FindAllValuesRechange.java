package com.datacenter.recargas.services;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.exeptions.ErrorReaderDatabaseException;
import com.datacenter.recargas.repositories.ValueRechangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FindAllValuesRechange {

    @Autowired
    private ValueRechangeRepository valueRechangeRepository;

    public ResponseDTO execute() {
        try {
             return new ResponseDTO(HttpStatus.OK,"OK",null,valueRechangeRepository.findAll());
        } catch (Exception ex) {
            throw new ErrorReaderDatabaseException(ex);
        }
    }

}
