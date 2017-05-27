create database catraia;

use catraia;

create table Marinheiro(
	id INT NOT NULL auto_increment,
	nome VARCHAR(255) NOT NULL,
    habilitacao VARCHAR(255) NOT NULL,
    UNIQUE(habilitacao,nome),
    primary key(id)
);

-- Teste, abstrair com Usuario- Campos email,nome, podem pertenner ao usuário.
create table Responsavel(
	id INT NOT NULL auto_increment,
    email VARCHAR(255) NOT NULL ,
    nome VARCHAR(255),
    senha VARCHAR(255),
	primary key(id),
    Unique(nome)
);


create table Embarcacao(
	id INT NOT NULL auto_increment,
	incricao INT,
    nome VARCHAR(255),
    id_responsavel int not null,
    primary key(id),
    CONSTRAINT FK_ResponsavelEmbarcarcao 
		FOREIGN KEY(id_responsavel) 
		references Responsavel(id)
    );
    
-- Registro da Viagem/ Travessia
create table MarinheiroEmbarcacao (
	id int not null auto_increment,
    id_marinheiro int not null,
    id_embarcacao int not null,
    primary key(id),
    CONSTRAINT FK_Marinheiro_MarinheiroEmbarcacao 
		FOREIGN KEY(id_marinheiro)
		REFERENCES Marinheiro(id),
	CONSTRAINT FK_Embarcacao_MarinheiroEmbarcacao
		FOREIGN KEY(id_embarcacao)
		REFERENCES Embarcacao(id)
	);
    
create table Travessia (
	id INT NOT NULL auto_increment,
    id_marinheiro_embarcacao int not null,
    data_hora DATETIME,
    primary key(id),
    CONSTRAINT FK_MarinheiroEmbarcacao_Travessia
		FOREIGN KEY(id_marinheiro_embarcacao)
        REFERENCES MarinheiroEmbarcacao (id)
	);

create table Usuario (	
	id INT NOT NULL auto_increment,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
	primary key(id),
    UNIQUE(email)
);
    
    
    
    
    