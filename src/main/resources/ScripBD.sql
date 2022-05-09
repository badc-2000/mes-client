drop database clientsbd;

create database clientsbd;

GRANT ALL PRIVILEGES ON clientsbd.* TO 'root' @'localhost';

USE clientsbd;

CREATE TABLE endereco(
    id int AUTO_INCREMENT,
    cep varchar(8) NOT NULL,
    rua varchar(20) NOT NULL,
    bairro varchar(20) NOT NULL,
    numero int NOT NULL,
    cidade varchar(20) NOT NULL,
    uf varchar(2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE client(
    id int AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    cpf varchar(11) NOT NULL,
    sexo varchar(1) NOT NULL,
    dataNascimento DATE NOT NULL DEFAULT CURRENT_TIME,
    client_addressID int,
    PRIMARY KEY (id),
    FOREIGN KEY (client_addressID) REFERENCES endereco(id)
);

