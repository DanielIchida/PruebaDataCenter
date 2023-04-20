package com.datacenter.recargas.controllers;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.services.SearchRecharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recharge")
public class SearchRechargeController {

    @Autowired
    private SearchRecharge searchRecharge;

    @GetMapping("by/{idSeller}/{idOperation}")
    public ResponseEntity<ResponseDTO> bySellerAndOperation(@RequestParam("idSeller") Long idSeller,@RequestParam("idOperation") Long idOperation) {
         ResponseDTO responseDTO = searchRecharge.findOperatorAndSeller(idOperation,idSeller);
         return ResponseEntity.status(responseDTO.getStatus()).body(responseDTO);
    }

}
