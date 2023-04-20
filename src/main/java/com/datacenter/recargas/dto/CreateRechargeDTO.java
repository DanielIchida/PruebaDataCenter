package com.datacenter.recargas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRechargeDTO {

    private String number;
    private Long recharge;
    private Long valueRecharge;

}
