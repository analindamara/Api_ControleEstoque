CREATE DATABASE ControleEstoque;
USE ControleEstoque;

CREATE TABLE usuario (
    idUsuario BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    endereco VARCHAR(150) NOT NULL,
    setor VARCHAR(150) NOT NULL
);

CREATE TABLE produtos (
    idProduto BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    quantidade INT NOT NULL,
    stats VARCHAR(80)
);

CREATE TABLE saida (
    idSaida BIGINT PRIMARY KEY AUTO_INCREMENT,
    dataSaida DATE NOT NULL,
    id_Usuario BIGINT,
    id_Produto BIGINT,
    quantidade_saida INT NOT NULL,
    FOREIGN KEY (id_Usuario) REFERENCES usuario(idUsuario),
    FOREIGN KEY (id_Produto) REFERENCES produtos(idProduto)
);
