package com.datacenter.recargas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "valores_recarga")
@Getter
@Setter
public class ValueRecharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valor_recarga")
    private Long id;

    @Column(name = "cantidad",precision = 15,scale = 2,columnDefinition = "DECIMAL(15,2)")
    private float amount;


}
