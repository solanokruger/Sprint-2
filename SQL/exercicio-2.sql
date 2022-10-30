CREATE DATABASE sprint2;
USE sprint2;

CREATE TABLE filme(
	id INT AUTO_INCREMENT,
    nome VARCHAR(60),
    descricao VARCHAR(65),
    ano DATE,
	PRIMARY KEY (id)
);

INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 1", "Filme de Terror", '2020-10-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 2", "Filme de Ação", '2021-08-04');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 3", "Filme de Suspense", '2020-11-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 4", "Filme de Comédia", '2019-09-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 5", "Filme de Comédia Romantica", '2020-09-05');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 6", "Filme de Ação", '2022-10-05');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 7", "Filme de Animação", '2018-06-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 8", "Filme de Comédia", '2015-10-02');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 9", "Filme de Drama", '2020-05-02');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 10", "Filme de Terror", '2017-09-11');

INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 11", "Filme de Animação", '2018-06-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 12", "Filme de Terror", '2020-10-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 13", "Filme de ação", '2010-08-25');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 14", "Filme de Comédia Romantica", '2018-06-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 15", "Filme de ação", '2010-08-25');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 16", "Filme de Comédia Romantica", '2017-09-11');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 17", "Filme de ação", '2010-08-25');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 18", "Filme de Comédia", '2015-10-02');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 19", "Filme de Animação", '2018-06-01');
INSERT INTO filme(nome, descricao, ano) VALUES ("Filme 20", "Filme de ação", '2010-08-25');
