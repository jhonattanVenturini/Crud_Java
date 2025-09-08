# 🚀 CRUD em Java + MySQL (POO)

![Java](https://img.shields.io/badge/Java-17-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)

Um **CRUD completo** (Create, Read, Update, Delete) desenvolvido em **Java** com **POO**, integrado ao **MySQL**, com senhas criptografadas (SHA-256).  

---

## ⚙️ Tecnologias Utilizadas
- **Java 17+**
- **MySQL 8+**
- **JDBC (MySQL Connector)**
- **POO (Programação Orientada a Objetos)**

---

## 📂 Estrutura do Projeto

src/
├── Pessoa.java
├── PessoaDAO.java
├── Criptografia.java
└── Main.java

lib/
└── mysql-connector-j-9.0.0.jar

database/
└── exemplo.sql

sql
Copiar código

> ⚠️ A pasta `lib/` é obrigatória para o **driver JDBC**.

---

## 🗄️ Banco de Dados
Arquivo `database/exemplo.sql` para criar banco e tabela:

```sql
CREATE DATABASE IF NOT EXISTS exemplo;
USE exemplo;

CREATE TABLE IF NOT EXISTS pessoas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);
Executar script no terminal MySQL: 

mysql -u root -p < database/exemplo.sql 
 

 

🔧 Como Rodar 

1️⃣ Clone o projeto 

git clone https://github.com/seu-usuario/nome-do-repo.git 
cd nome-do-repo 
 

2️⃣ Adicione o MySQL Connector 

# Baixe o .jar aqui: https://dev.mysql.com/downloads/connector/j/ 
# Coloque em lib/mysql-connector-j-9.0.0.jar 
 

3️⃣ Compile o projeto 

Windows: 

javac -cp "lib/mysql-connector-j-9.0.0.jar;src" src/*.java 
 

Linux/Mac: 

javac -cp "lib/mysql-connector-j-9.0.0.jar:src" src/*.java 
 

4️⃣ Execute o programa 

Windows: 

java -cp "lib/mysql-connector-j-9.0.0.jar;src" Main 
 

Linux/Mac: 

java -cp "lib/mysql-connector-j-9.0.0.jar:src" Main 
 

 

📌 Funcionalidades 

Operação 

Emoji 

Descrição 

Create 

🟢 

Cadastrar clientes 

Read 

🔵 

Listar todos clientes 

Update 

🟡 

Atualizar cliente pelo ID 

Delete 

🔴 

Remover cliente pelo ID 

 

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

As senhas são criptografadas em SHA-256, garantindo que não fiquem em texto puro. 

Exemplo no banco: 

ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f 
 

 

🚀 Próximos Passos 

🔍 Buscar cliente por email ou ID específico 

🌐 Criar API REST com Spring Boot 

🎨 Interface gráfica em JavaFX ou Angular/React 

🧪 Adicionar testes unitários para validação de dados 

 

Interface gráfica em JavaFX ou Angular/React
