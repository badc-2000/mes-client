package com.mes_client.demo.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;

}
