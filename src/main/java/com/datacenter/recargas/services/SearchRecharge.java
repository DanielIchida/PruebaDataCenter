package com.datacenter.recargas.services;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.entities.Operator;
import com.datacenter.recargas.entities.Recharge;
import com.datacenter.recargas.entities.Seller;
import com.datacenter.recargas.exeptions.ErrorReaderDatabaseException;
import com.datacenter.recargas.exeptions.NoExitsElementException;
import com.datacenter.recargas.repositories.OperatorRepository;
import com.datacenter.recargas.repositories.RechargeRepository;
import com.datacenter.recargas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchRecharge {

    @Autowired
    private RechargeRepository rechargeRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private OperatorRepository operatorRepository;

    public ResponseDTO  findOperatorAndSeller(Long idOperator, Long idSeller) {
        Seller seller = sellerRepository.findById(idSeller).orElseThrow(() -> new NoExitsElementException("Vendedor ",idSeller));
        Operator operator = operatorRepository.findById(idOperator).orElseThrow(() -> new NoExitsElementException("Operador ",idOperator));
        try {
            return new ResponseDTO(HttpStatus.OK,"OK",null,rechargeRepository.findBySellerIdAndOperatorId(seller.getId(),operator.getId()));
        } catch (Exception ex) {
            throw new ErrorReaderDatabaseException(ex);
        }
    }

}
