CEATE DATABASE emprestimo;
SELECT DATABASE emprestimo;

CREATE TABLE autor (
	id Int PRIMARY KEY,
    nome_autor varchar(50)
);

CREATE TABLE editora (
	id Int PRIMARY KEY,
    nome_editora varchar(50)
);

CREATE TABLE emprestimo (
	id Int PRIMARY KEY,
    data_emprestimo varchar(50)
);

CREATE TABLE livro (
	id Int PRIMARY KEY,
    nome_livro varchar(50),
    descricao varchar(50),
    ano_publicacao varchar(50),
    FOREIGN KEY (id) REFERENCES editora(id),
    FOREIGN KEY (id) REFERENCES autor(id)
);

CREATE TABLE edicao (
	id Int PRIMARY KEY,
    ano varchar(50),
    nome_editora varchar(50),
    FOREIGN KEY (id) REFERENCES livro(id)
);

CREATE TABLE emprestimo_livro (
	id int PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES livro(id),
    FOREIGN KEY (id) REFERENCES emprestimo(id)
);