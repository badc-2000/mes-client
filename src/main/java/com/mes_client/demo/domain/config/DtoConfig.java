package com.mes_client.demo.domain.config;

import com.mes_client.demo.domain.dto.ClientDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoConfig {
    
    @Bean
    public ClientDto clientDto(){
        return new ClientDto();
    }
}
