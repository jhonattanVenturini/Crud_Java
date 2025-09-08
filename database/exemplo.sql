-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS exemplo;
USE exemplo;

-- Criação da tabela pessoas
CREATE TABLE IF NOT EXISTS pessoas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);
