package com.mes_client.demo.domain.repository;

import com.mes_client.demo.domain.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
