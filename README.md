---
# 🚀 CRUD em Java + MySQL (POO)

![Java](https://img.shields.io/badge/Java-17-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Status](https://img.shields.io/badge/Status-Completo-success)


## ⚙️ Tecnologias Utilizadas
- 💻 **Java 17+**
- 🗄️ **MySQL 8+**
- 🔌 **JDBC (MySQL Connector)**
- 🏗️ **POO (Programação Orientada a Objetos)**

-----

Um **CRUD completo** (Create, Read, Update, Delete) desenvolvido em **Java** com **POO**, integrado ao **MySQL** e com senhas criptografadas (SHA-256). Este projeto é um guia prático para aprender a conectar uma aplicação Java a um banco de dados, seguindo boas práticas.

---

## ✅ Pré-requisitos

Antes de começar, garanta que você tenha o seguinte ambiente configurado em sua máquina:

1.  **Java JDK 17 ou superior:** Essencial para compilar e rodar o código.
    > [!IMPORTANT]
    > Verifique se o `JAVA_HOME` está configurado nas variáveis de ambiente do seu sistema.

2.  **MySQL Server 8 ou superior:** O banco de dados onde as informações serão armazenadas.

3.  **Um cliente de Banco de Dados:** (Opcional, mas recomendado) Ferramentas como **MySQL Workbench** ou **DBeaver** facilitam a visualização e gerenciamento do banco.

4.  **Um Editor de Código:** Como VS Code, IntelliJ ou Eclipse.

---

## 🔧 Guia de Configuração e Execução

### Passo 1: Crie a Estrutura de Pastas e Arquivos

## 📂 Estrutura do Projeto

A estrutura foi organizada para separar as responsabilidades de cada parte do código, facilitando a manutenção e a compreensão.


```
meu-projeto/
├── src/                          # Código fonte Java
│   ├── Pessoa.java               # Modelo de cliente (Entidade)
│   ├── PessoaDAO.java            # Classe DAO com as operações CRUD (Data Access Object)
│   ├── Criptografia.java         # Classe utilitária para criptografia SHA-256
│   └── Main.java                 # Menu interativo e ponto de entrada da aplicação
│
├── lib/                          # Bibliotecas e drivers externos
│   └── mysql-connector-j-9.0.0.jar # Driver JDBC para conexão com o MySQL
│
├── database/                     # Scripts do banco de dados
│   └── exemplo.sql               # Script para criação do banco de dados e da tabela
│
└── README.md                     # Documentação do projeto
```
---
### Passo 2: Crie o Banco de Dados

Execute o script abaixo para criar a base de dados `exemplo` e a tabela `pessoas`.

**Script do Banco (`database/exemplo.sql`):**.

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
```
## Comando para executar:
```
mysql -u root -p < database/exemplo.sql
```

## Passo 3: Adicione o Conector Java/MySQL (JDBC)
Para que o Java consiga "conversar" com o MySQL, é necessário um driver chamado Connector/J.

Baixe o arquivo .jar no site oficial do MySQL:

Link para Download: https://dev.mysql.com/downloads/connector/j/
(Escolha a opção "Platform Independent" e baixe o arquivo ZIP ou TAR. Extraia e encontre o arquivo mysql-connector-j-X.X.X.jar)

Coloque o arquivo na pasta lib/:

[!WARNING]
O projeto não vai funcionar sem este arquivo na pasta lib/, pois ele é a ponte entre a aplicação e o banco de dados.
---

## Passo 4: Compile e Execute a Aplicação

Com o ambiente e o banco de dados prontos, o último passo é compilar e rodar o código-fonte Java. Abra o terminal na raiz do seu projeto e siga as instruções abaixo.

**1. Compile o Código-Fonte**

Este comando transforma seus arquivos `.java` em arquivos `.class` executáveis.

* **No Windows:**
    ```bash
    javac -cp "lib/mysql-connector-j-9.0.0.jar;src" src/*.java
    ```
* **No Linux/Mac:**
    ```bash
    javac -cp "lib/mysql-connector-j-9.0.0.jar:src" src/*.java
    ```

**2. Execute o Programa**

Após a compilação bem-sucedida, este comando inicia a aplicação.

* **No Windows:**
    ```bash
    java -cp "lib/mysql-connector-j-9.0.0.jar;src" Main
    ```
* **No Linux/Mac:**
    ```bash
    java -cp "lib/mysql-connector-j-9.0.0.jar:src" Main
    ```

### Saída no Console

Se todos os passos foram seguidos corretamente, o programa será iniciado e você verá este menu interativo no seu terminal, aguardando sua escolha:

```makefile
===== MENU CRUD - CLIENTES =====
1 - Cadastrar Cliente
2 - Listar Clientes
3 - Atualizar Cliente
4 - Deletar Cliente
0 - Sair
Escolha uma opção:
```
## 🚀 Evolução do Projeto: Próximos Passos

Este projeto é uma base sólida. Para torná-lo ainda mais robusto e alinhado com as práticas de mercado, considere as seguintes melhorias:

1.  **🌐 Criar uma API REST com Spring Boot**
    * **O quê?** Transforme a lógica de negócio (o `PessoaDAO`) em endpoints HTTP (Ex: `GET /clientes`, `POST /clientes`).
    * **Por quê?** Isso desacopla o back-end e permite que qualquer front-end (web, mobile) consuma os dados, criando uma arquitetura de microserviços.

2.  **🎨 Desenvolver uma Interface Gráfica (UI)**
    * **O quê?** Substitua o menu de console por uma interface visual amigável.
    * **Como?** Você pode criar um front-end web com **React** ou **Angular** (consumindo a API) ou usar uma tecnologia Java como **JavaFX** para uma aplicação desktop.

3.  **🧪 Adicionar Testes Automatizados**
    * **O quê?** Escreva testes unitários com **JUnit** para as classes `PessoaDAO` e `Criptografia`.
    * **Por quê?** Para garantir que as funcionalidades existentes continuem funcionando corretamente após novas alterações e para aumentar a qualidade e a confiabilidade do código.

4.  **🛡️ Validação de Dados e Tratamento de Erros**
    * **O quê?** Implemente validações nos dados de entrada (ex: verificar se o e-mail é válido, se a idade é positiva) e melhore o tratamento de exceções.
    * **Por quê?** Para tornar a aplicação mais segura, robusta e à prova de falhas.
  
---
          # Documentação do projeto
