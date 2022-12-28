create table pessoa_fisica (
id bigint not null auto_increment,
nome varchar(80) not null,
cpf char(11) not null,

primary key (id),
constraint uk_cpf unique key (cpf)
)engine=InnoDB, charset=utf8mb4;

create table pessoa_juridica (
id bigint not null auto_increment,
nome varchar(255) not null,
cnpj char(14) not null,

primary key (id),
unique key(cnpj)
) engine=InnoDB, charset=utf8mb4;