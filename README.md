# 📘 Java User API

Esta aplicação é um serviço REST em **Java + Spring Boot**, responsável por gerenciar usuários.  
O projeto possui suporte para bancos de dados **H2** e **PostgreSQL**, com branches separadas para cada configuração.  

---

## 🚀 **Execução do Projeto**

1️⃣ Certifique-se de ter o **Java 17+** e o **Maven Wrapper** configurados no ambiente.  

2️⃣ Copie o arquivo `.env.exemplo` para `.env` e defina as variáveis necessárias:  

```bash
cp .env.exemplo .env
```

3️⃣ Execute o projeto com o comando:

```bash
export $(grep -v '^#' .env | xargs) && ./mvnw spring-boot:run
```

---

## 🌿 **Branches Disponíveis**

- **`db-jpa-h2`** → Configuração com banco de dados **H2** (em memória, **os dados são apagados a cada reinício do projeto**).  
- **`db-jpa-postgres`** → Configuração com banco **PostgreSQL**.

Para trocar de branch:

```bash
git checkout db-jpa-h2        # Para usar H2
git checkout db-jpa-postgres  # Para usar PostgreSQL
```

---

## ⚙️ **Variáveis de Ambiente**

- As variáveis devem ser declaradas no arquivo `.env`.
- O arquivo `.env.exemplo` contém todas as chaves necessárias para configuração.

---

## 📡 **Endpoints Disponíveis**

Base URL: `http://localhost:8080`

### 👤 **Usuários**

- **GET** `/user/` → Lista todos os usuários  
- **GET** `/user/:id` → Busca um usuário pelo ID  
- **POST** `/user/` → Cria um novo usuário  
  **Body JSON:**
  ```json
  {
    "nome": "Fulano da Silva",
    "email": "fulano@email.com"
  }
  ```
- **DELETE** `/user/:id` → Remove um usuário pelo ID

---

## 🛠 **Tecnologias Utilizadas**

- Java 17+
- Spring Boot
- Maven Wrapper
- JPA / Hibernate
- H2 Database (branch de testes)
- PostgreSQL (branch de produção)

---

## 📌 **Notas**

- Use a branch **db-jpa-h2** para desenvolvimento e testes locais rápidos.  
  ⚠️ **Atenção:** no banco H2 os dados são armazenados apenas em memória e **são perdidos a cada execução**.  
- Para produção, configure e use a branch **db-jpa-postgres**.  
- Sempre configure corretamente as variáveis no `.env` antes de executar o projeto.  
