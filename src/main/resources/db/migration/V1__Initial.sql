CREATE TABLE tb_poi (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	coordx INT(5) NOT NULL,
	coordy INT(5) NOT NULL
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Lanchonete', 27, 12);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Posto', 31, 18);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Joalheria', 15, 12);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Floricultura', 19, 21);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Pub', 12, 8);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Supermercado', 23, 6);
INSERT INTO tb_poi (nome, coordx, coordy) VALUES ('Churrascaria', 28, 2);