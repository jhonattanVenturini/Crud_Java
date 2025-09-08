📝 CRUD em Java + MySQL (POO)

Este projeto é um CRUD completo (Create, Read, Update, Delete) desenvolvido em Java com POO e integrado ao MySQL.
O sistema cadastra clientes com os seguintes dados:

Nome 🧑

Idade 🎂

E-mail 📧

Senha 🔑 (armazenada de forma criptografada com SHA-256)

⚙️ Tecnologias Utilizadas

Java 17+ (funciona também em versões anteriores)

MySQL 8+

JDBC (MySQL Connector)

POO (Programação Orientada a Objetos)

📂 Estrutura do Projeto
src/
 ├── Pessoa.java          # Classe modelo (entidade)
 ├── PessoaDAO.java       # Classe DAO (operações CRUD no banco)
 ├── Criptografia.java    # Classe utilitária para criptografia de senha (SHA-256)
 └── Main.java            # Classe principal com menu interativo

lib/
 └── mysql-connector-j-9.0.0.jar   # Conector JDBC do MySQL

database/
 └── exemplo.sql          # Script para criar banco e tabela

🗄️ Banco de Dados

Na pasta database/ existe o arquivo exemplo.sql que cria o banco e a tabela necessária.

📌 Conteúdo do arquivo exemplo.sql
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

🔧 Como executar o script

No terminal do MySQL, rode:

mysql -u root -p < database/exemplo.sql


Isso vai criar o banco exemplo e a tabela pessoas.

🔧 Como Rodar o Projeto

Clone o repositório

git clone https://github.com/seu-usuario/nome-do-repo.git
cd nome-do-repo


Adicione o MySQL Connector

Baixe o .jar aqui
.

Coloque o arquivo dentro da pasta lib/.

Exemplo: lib/mysql-connector-j-9.0.0.jar

Compile os arquivos Java

Windows (PowerShell ou CMD):

javac -cp "lib/mysql-connector-j-9.0.0.jar;src" src/*.java


Linux/Mac (bash/zsh):

javac -cp "lib/mysql-connector-j-9.0.0.jar:src" src/*.java


Execute o programa

Windows:

java -cp "lib/mysql-connector-j-9.0.0.jar;src" Main


Linux/Mac:

java -cp "lib/mysql-connector-j-9.0.0.jar:src" Main

📌 Funcionalidades

Cadastrar Cliente (Create)

Listar Clientes (Read)

Atualizar Cliente (Update)

Excluir Cliente (Delete)

📸 Exemplo de Execução
===== MENU CRUD - CLIENTES =====
1 - Cadastrar Cliente
2 - Listar Clientes
3 - Atualizar Cliente
4 - Deletar Cliente
0 - Sair
Escolha uma opção: 1

Nome: João Silva
Idade: 25
Email: joao@email.com
Senha: 12345
✅ Pessoa cadastrada com sucesso!

🔒 Segurança

As senhas não ficam armazenadas em texto puro.
Antes de salvar no banco, elas são convertidas em um hash SHA-256.

Exemplo no banco:

ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f

🚀 Próximos Passos

Implementar busca por email/ID específico.

Migrar para uma API REST com Spring Boot.

Criar interface gráfica em JavaFX ou front-end em Angular/React.