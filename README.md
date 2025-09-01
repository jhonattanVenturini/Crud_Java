📌 Projeto: CRUD em Java

Este projeto demonstra um sistema simples de CRUD (Create, Read, Update, Delete) desenvolvido em Java com integração ao MySQL.

🔹 O objetivo é servir como base de estudo para conexão com banco de dados, manipulação de registros e boas práticas no desenvolvimento em Java.

⚙️ Funcionalidades

✅ Criar registros no banco de dados
✅ Ler/Listar informações já salvas
✅ Atualizar registros existentes
✅ Excluir registros do banco
✅ Criptografar senhas para maior segurança

🗂 Estrutura do Projeto
Crud_Java/
├── lib/                     # Dependências externas (JARs)
├── ConexaoMySQL.java        # Classe de conexão com o MySQL
├── Criptografia.java        # Funções para criptografar senhas/dados
├── InserirPessoas.java      # Exemplo de inserção de registros
└── exemplo_pessoas.sql      # Script inicial do banco de dados

🔧 Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

☕ Java JDK 8+

🐬 MySQL Server

🖥 MySQL Workbench (opcional, para gerenciar o banco)

📦 Driver JDBC do MySQL (mysql-connector-java-x.x.x.jar) adicionado na pasta lib

🚀 Como executar o projeto

Clone este repositório

git clone https://github.com/jhonattanVenturini/Crud_Java.git


Configure o banco de dados

Importe o script exemplo_pessoas.sql no seu MySQL

Altere os dados de conexão (usuário, senha, porta, banco) no arquivo ConexaoMySQL.java

Compile e rode o projeto

javac -cp ".;lib/mysql-connector-java-x.x.x.jar" *.java
java -cp ".;lib/mysql-connector-java-x.x.x.jar" InserirPessoas

📖 Exemplo de Uso

Ao rodar a classe InserirPessoas.java, um novo registro será adicionado ao banco.
A classe Criptografia.java pode ser usada para proteger senhas antes de salvar.

📌 Melhorias Futuras

✨ Implementar interface gráfica (Java Swing ou JavaFX)
✨ Criar API com Spring Boot para expor os dados via REST
✨ Melhorar o tratamento de erros e mensagens ao usuário
✨ Adicionar testes automatizados com JUnit

👨‍💻 Autor

Feito com 💙 por Jhonattan de Carvalho Venturini

🔗 Meu GitHub
