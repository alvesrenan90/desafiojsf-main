create table autor 
(
  id_autor integer(11) primary key NOT NULL,
  nome varchar(120) NOT NULL,
  sexo integer(30) NOT NULL,
  email varchar (80) null,
  data_nascimento varchar(20) null,
  pais_origem varchar(80),
  cpf varchar (11),
  foreign key (fk_obra) references obra(id_obra)  
);
create table obra 
(
  id_obra integer(11) primary key NOT NULL,
  descricao varchar(240) NOT NULL,
  data_publicacao date NULL,
  data_exposicao date NULL,  
  foreign key(fk_autor) references autor(id_autor)
);


insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (1, 'Vidas Secas', 'Nacional,' "2014-10-15", "2017-10-16", 4);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (2, 'A hora da estrela', 'Nacional', "2014-10-14", "2019-10-15", 2);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (3, 'O menino de asas', 'Nacional', "2018-10-14", "2020-10-17", 3);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (4, 'O código da Vinci', 'Internacional', "2010-10-14", "2012-10-15", 1);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (5, 'Desbloqueie o poder da sua mente', 'Nacional', "2021-10-14", "2022-10-15", 5);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (6, 'O escaravelho do diabo', 'Nacional', "2015-10-14", "2016-10-15", 4);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (7, 'A fortaleza', 'Internacional',"2014-10-14", "2015-11-15", 1);
insert into obra (id_obra, descricao, data_publicacao, data_exposicao, id_autor) values (8, 'Pai rico e pai pobre', 'Internacional', "2014-11-14", "2019-10-15", 5);


insert into autor (id_autor, nome, sexo, email, data_nascimento, pais_origem, cpf, id_obra) values (1, 'Dan Brown', 'Masculino', 'danbrownfake@hotmail.com', '2009-03-02', 'OUTROS', '869.244.570-37', 4);
insert into autor (id_autor, nome, sexo, email, data_nascimento, pais_origem, cpf, id_obra) values (2, 'Clarice Lispector', 'Feminino', 'clariceLispectorfake@hotmail.com', '1990-03-02', 'BRASIL', '849.121.220-50', 2);
insert into autor (id_autor, nome, sexo, email, data_nascimento, pais_origem, cpf, id_obra) values (3, 'Homero Homem', 'Masculino', 'homeroHomemfake@hotmail.com', '1980-03-02', 'BRASIL', '280.311.500-01', 3);
insert into autor (id_autor, nome, sexo, email, data_nascimento, pais_origem, cpf, id_obra) values (4, 'Graciliano Ramos', 'Masculino', 'graciliano_ramos@hotmail.com', '1970-03-02', 'BRASIL', '444.760.100-16', 4);
insert into autor (id_autor, nome, sexo, email, data_nascimento, pais_origem, cpf, id_obra) values (5, 'Robert Kiyosaki', 'Masculino', 'kiyosaki_robert@hotmail.com', '1960-03-02', 'OUTROS', '872.620.450-91', 8);

