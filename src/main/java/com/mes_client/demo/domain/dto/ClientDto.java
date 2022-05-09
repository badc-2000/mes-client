package com.mes_client.demo.domain.dto;

import java.util.Date;

import com.mes_client.demo.domain.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    Long id;
    String nome;
    String cpf;
    String sexo;
    Date datanascimento;
    Address Endereco;
}
