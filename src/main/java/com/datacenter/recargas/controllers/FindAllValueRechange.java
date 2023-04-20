package com.datacenter.recargas.controllers;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.services.FindAllValuesRechange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("valuerechange")
public class FindAllValueRechange {

    @Autowired
    FindAllValuesRechange findAllValuesRechange;

    @GetMapping("list")
    public ResponseEntity<ResponseDTO> list() {
        ResponseDTO responseDTO = findAllValuesRechange.execute();
        return ResponseEntity.status(responseDTO.getStatus()).body(responseDTO);
    }


}
