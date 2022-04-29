drop database clientsbd;

create database clientsbd;

GRANT ALL PRIVILAGES ON clientsbd.* TO 'root' @'localhost';

USE clientsbd;

CREATE TABLE client(
    id int AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    cpf varchar(11) NOT NULL,
    sexo varchar(1) NOT NULL,
    dataNascimento DATE NOT NULL DEFAULT CURRENT_TIME,
    PRIMARY KEY (id)
);