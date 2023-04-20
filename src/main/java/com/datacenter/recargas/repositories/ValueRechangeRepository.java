package com.datacenter.recargas.repositories;

import com.datacenter.recargas.entities.ValueRecharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueRechangeRepository extends JpaRepository<ValueRecharge,Long> {
}
