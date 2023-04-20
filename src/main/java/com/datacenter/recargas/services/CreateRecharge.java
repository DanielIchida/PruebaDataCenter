package com.datacenter.recargas.services;

import com.datacenter.recargas.dto.ResponseDTO;
import com.datacenter.recargas.entities.Recharge;
import com.datacenter.recargas.entities.SellRecharge;
import com.datacenter.recargas.entities.ValueRecharge;
import com.datacenter.recargas.exeptions.ErrorInsertInDatabaseException;
import com.datacenter.recargas.exeptions.ExceedAmountException;
import com.datacenter.recargas.exeptions.NoExitsElementException;
import com.datacenter.recargas.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CreateRecharge {

    @Autowired
    private SellRechargeRepository sellRechargeRepository;

    @Autowired
    private RechargeRepository rechargeRepository;

    @Autowired
    private ValueRechangeRepository valueRechangeRepository;

    public ResponseDTO execute(String cellphone, Long rechargeId,Long valueRechangeId) {
        ValueRecharge valueRecharge = valueRechangeRepository.findById(valueRechangeId).orElseThrow(() -> new NoExitsElementException("Valor Recarga",valueRechangeId));
        Recharge recharge = rechargeRepository.findById(rechargeId).orElseThrow(() -> new NoExitsElementException("Recarga", 1L));
        float totalRecharge = sellRechargeRepository.sumByIdRecharge(recharge.getId());
        float amountPlusRecharge = totalRecharge + valueRecharge.getAmount();
        if(amountPlusRecharge > recharge.getAmountInit()) {
            throw new ExceedAmountException();
        }
        SellRecharge sellRecharge = new SellRecharge();
        sellRecharge.setCellphone(cellphone);
        sellRecharge.setRecharge(recharge);
        sellRecharge.setValueRecharge(valueRecharge);
        try {
             SellRecharge newSellRecharge = sellRechargeRepository.save(sellRecharge);
             return new ResponseDTO(HttpStatus.OK,"Ok",null,newSellRecharge);
        } catch (Exception ex) {
             throw new ErrorInsertInDatabaseException(ex);
        }
    }

}
