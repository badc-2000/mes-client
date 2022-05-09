package com.mes_client.demo.domain.repository;

import com.mes_client.demo.domain.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
