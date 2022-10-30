CREATE DATABASE sprint2;
USE sprint2;

CREATE TABLE produto(
	id INT AUTO_INCREMENT,
	nome VARCHAR(50),
	descricao VARCHAR(55),
	quantidade INT,
	preco DECIMAL(10,2),
	PRIMARY KEY(id)
);