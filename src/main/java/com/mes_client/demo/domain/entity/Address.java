package com.mes_client.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cep")
    @Length(max = 9)
    @NotBlank
    private String cep;

    @Column(name = "rua")
    @Pattern(regexp="^[A-Za-z]*$",message = "Rua invalida")
    @Length(max = 50)
    @NotBlank
    private String rua;

    @Column(name = "bairro")
    @NotBlank
    private String bairro;
    
    @Column(name = "numero")
    @NotBlank
    private int numero;
    
    @Column(name = "cidade")
    @NotBlank
    private String cidade;
    
    @Column(name = "UF")
    @NotBlank
    private String UF;

    @OneToOne(mappedBy = "endereco")
    private Client cliente;

}
