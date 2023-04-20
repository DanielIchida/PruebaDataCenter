package com.datacenter.recargas.repositories;

import com.datacenter.recargas.entities.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepository extends JpaRepository<Operator,Long> {
}
