package com.datacenter.recargas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "venta_recarga")
@Getter
@Setter
public class SellRecharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta_recarga")
    private Long id;

    @Column(name = "celular")
    private String cellphone;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_valor_recarga" , referencedColumnName = "id_valor_recarga")
    private ValueRecharge valueRecharge;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_recarga" , referencedColumnName = "id_recarga")
    private Recharge recharge;

}
