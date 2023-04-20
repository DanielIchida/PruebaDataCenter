package com.datacenter.recargas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vendedores")
@Getter
@Setter
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "correo")
    private String email;

    @Column(name = "telefono")
    private String phone;


}
