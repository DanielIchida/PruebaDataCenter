package com.datacenter.recargas.repositories;

import com.datacenter.recargas.entities.SellRecharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRechargeRepository extends JpaRepository<SellRecharge,Long> {

    @Query("SELECT SUM(sr.valueRecharge.amount) FROM SellRecharge sr WHERE sr.recharge.id = :idRecharge")
    float sumByIdRecharge(@Param("idRecharge") Long idRecharge);

}
