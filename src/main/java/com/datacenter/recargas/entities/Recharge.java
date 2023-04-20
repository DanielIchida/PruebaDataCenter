package com.datacenter.recargas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "recargas")
@Getter
@Setter
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recarga")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vendedor" , referencedColumnName = "id_vendedor")
    private Seller seller;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_operador" , referencedColumnName = "id_operador")
    private Operator operator;

    @Column(name = "cantidad_inicial",precision = 15,scale = 2,columnDefinition = "DECIMAL(15,2)")
    private float amountInit;


}
