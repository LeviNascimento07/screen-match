

````markdown
# 🎬 Screenmatch com Spring Boot

Projeto desenvolvido com o objetivo de praticar e demonstrar o uso do **Spring Boot** para consumo de APIs externas, persistência de dados com JPA/Hibernate e uso de boas práticas de desenvolvimento em Java.

## 📚 Descrição

O Screenmatch é um sistema simples que busca **informações de séries e episódios** por meio da API da OMDb (Open Movie Database) e armazena os dados em um banco de dados relacional utilizando Spring Data JPA.

O projeto foi desenvolvido durante os estudos da imersão em Java da **Alura** e adaptado para fins de aprendizado.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- API OMDb
- Lombok

## ⚙️ Funcionalidades

- Buscar séries por nome na OMDb API.
- Armazenar dados da série e seus episódios no banco.
- Listar séries e episódios armazenados.
- Filtrar séries por critérios como gênero, avaliação, etc.
- Console web do banco H2 para visualização dos dados.

## 🔧 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/ZNitr0/screenmatch-ComSpringBoot.git
cd screenmatch-ComSpringBoot
````

2. Execute a aplicação (IDE ou CLI):

```bash
./mvnw spring-boot:run
```

3. Acesse no navegador:

```
http://localhost:8080
```

4. Para acessar o console do H2:

```
http://localhost:8080/h2-console
```

Use os seguintes dados:

* JDBC URL: `jdbc:h2:mem:testdb`
* User Name: `sa`
* Password: (deixe em branco)

## 📦 Estrutura de Pastas

```
src
└── main
    ├── java
    │   └── com.znitr0.screenmatch
    │       ├── controllers
    │       ├── models
    │       ├── repositories
    │       ├── services
    │       └── ScreenmatchApplication.java
    └── resources
        ├── application.properties
        └── static/templates (caso existam)
```

## 🔍 API OMDb

A aplicação consome dados da [OMDb API](http://www.omdbapi.com/). Para isso, é necessário um `API_KEY` que deve ser informado no código em:

```java
String ENDERECO = "https://www.omdbapi.com/?t=" + nomeSerie + "&apikey=SUA_API_KEY";
```

## 📄 Licença

Este projeto é apenas para fins educacionais.

---

Feito com 💻 por [ZNitr0](https://github.com/ZNitr0)

```

