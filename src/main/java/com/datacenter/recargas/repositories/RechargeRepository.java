package com.datacenter.recargas.repositories;

import com.datacenter.recargas.entities.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RechargeRepository extends JpaRepository<Recharge,Long> {

    @Query("SELECT r FROM Recharge r WHERE r.seller.id = :sellerId AND r.operator.id = :operatorId")
    List<Recharge> findBySellerIdAndOperatorId(
            @Param("sellerId") Long sellerId,@Param("operatorId") Long operatorId);

}
