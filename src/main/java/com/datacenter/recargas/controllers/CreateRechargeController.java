package com.datacenter.recargas.controllers;

import com.datacenter.recargas.dto.CreateRechargeDTO;
import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.services.CreateRecharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recharge")
public class CreateRechargeController {

    @Autowired
    CreateRecharge createRecharge;

    @PostMapping("create")
    public ResponseEntity<ResponseDTO> create(@RequestBody CreateRechargeDTO createRechargeDTO) {
        ResponseDTO responseDTO = createRecharge.execute(createRechargeDTO.getNumber(),createRechargeDTO.getRecharge(),createRechargeDTO.getValueRecharge());
        return ResponseEntity.status(responseDTO.getStatus()).body(responseDTO);
    }


}
