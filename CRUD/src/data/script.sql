create database CRUDManha;

create table tbUsuarios(
    id int not null primary key identity,
    nome varchar(200) not null,
    email varchar(200) not null,
    senha varchar(20) not null
)