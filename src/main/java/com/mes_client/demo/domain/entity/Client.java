package com.mes_client.demo.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cpf")
    @CPF
    @NotBlank
    private String cpf;

    @Column(name = "nome")
    @Pattern(regexp="^[A-Za-z]*$",message = "Nome invalido")
    @Length(max = 50)
    @NotBlank
    private String nome;
    
    @Column(name = "sexo")
    @Length(max = 1)
    @NotBlank
    private String sexo;
    
    @Column(name = "datanascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "EST")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;

    @OneToOne
    @JoinColumn(name = "endereco", referencedColumnName = "id")
    private Address endereco;

}
