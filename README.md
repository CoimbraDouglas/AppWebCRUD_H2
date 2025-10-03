# 📝 Projeto: CRUD com Spring Boot MVC, Lista em Memória e H2 + JPA  

## 📌 Descrição  
Este projeto é um **CRUD de Mensagens** desenvolvido com **Spring Boot**, aplicando o padrão arquitetural **MVC (Model-View-Controller)**.  
Inicialmente, as mensagens são armazenadas em uma lista em memória e, em seguida, os dados passam a ser persistidos em um **banco de dados H2** utilizando **Spring Data JPA**.  

O sistema expõe uma **API REST** com operações de **criação, leitura, atualização e exclusão** de mensagens.  

---

## 🚀 Tecnologias Utilizadas  
- **Java 17+**  
- **Spring Boot 3+**  
- **Spring Web**  
- **Spring DevTools**  
- **Spring Data JPA**  
- **H2 Database**  

---

## ⚙️ Como Rodar o Projeto  

1. Clone o repositório:  
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   cd SEU_REPOSITORIO
Compile e rode a aplicação:

bash
Copiar código
./mvnw spring-boot:run
ou

bash
Copiar código
mvn spring-boot:run
💡 Alternativamente, você pode rodar a aplicação direto pela sua IDE (IntelliJ, Eclipse, VS Code) executando a classe principal marcada com @SpringBootApplication.

Quando o servidor iniciar, acesse no navegador ou Postman:

arduino
Copiar código
http://localhost:8080
📡 Endpoints da API
➕ Criar Mensagem
POST /mensagens

json
Copiar código
{
  "texto": "Minha primeira mensagem"
}
📋 Listar Todas as Mensagens
GET /mensagens

Resposta (exemplo):

json
Copiar código
[
  {
    "id": 1,
    "texto": "Minha primeira mensagem"
  },
  {
    "id": 2,
    "texto": "Outra mensagem"
  }
]
🔍 Buscar Mensagem por ID
GET /mensagens/{id}

Exemplo:

bash
Copiar código
GET /mensagens/1
Resposta:

json
Copiar código
{
  "id": 1,
  "texto": "Minha primeira mensagem"
}
✏️ Atualizar Mensagem
PUT /mensagens/{id}

json
Copiar código
{
  "texto": "Mensagem atualizada"
}
❌ Deletar Mensagem
DELETE /mensagens/{id}

🗄️ Banco de Dados H2
A aplicação utiliza o banco H2 em memória.
Após rodar a aplicação, você pode acessar o console em:

👉 http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (vazio)

📸 Exemplo de Execução

✅ Testes com Postman/Insomnia
Certifique-se de que a aplicação está rodando (mvn spring-boot:run).

Abra o Postman ou Insomnia.

Teste os seguintes endpoints na URL base http://localhost:8080/mensagens:

POST /mensagens

GET /mensagens

GET /mensagens/{id}

PUT /mensagens/{id}

DELETE /mensagens/{id}

![Descrição da Imagem](src/main/resources/images/Capturadetela2025-10-02%214940.png)
