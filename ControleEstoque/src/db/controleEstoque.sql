//banco de dados
create database ControleEstoque;

use ControleEstoque;

create table usuario(
idUsuario int primary key auto_increment,
nome varchar(250),
endereco varchar(150),
setor varchar(150)
);

create table produtos(
idProduto int primary key auto_increment,
nome varchar(250),
quantidade int,
stats varchar(80)
);

create table saida(
idSaida int primary key auto_increment,
dataSaida date,
id_Usuario int,
id_Produto int,
quantidade_saida int,
foreign key (id_Usuario) references usuario (idUsuario),
foreign key (id_Produto) references produtos (idProduto)
);