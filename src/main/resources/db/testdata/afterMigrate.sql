set foreign_key_checks = 0;

delete from pessoa_fisica;
delete from pessoa_juridica;

set foreign_key_checks = 1;

alter table pessoa_fisica auto_increment=1;
alter table pessoa_juridica auto_increment=1;

insert into pessoa_fisica (nome, cpf) values ('Yuri', '12345678911');
insert into pessoa_fisica (nome, cpf) values ('Joao', '12345678910');