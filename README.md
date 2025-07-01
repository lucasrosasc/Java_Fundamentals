# Java Fundamentals

![Java](https://img.shields.io/badge/Java-21-blue?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-red?logo=apachemaven)
![Docker](https://img.shields.io/badge/Docker-blue?logo=docker)
![JUnit5](https://img.shields.io/badge/JUnit-5-green?logo=junit5)

Um repositório com exemplos de códigos básicos em Java, utilizando Maven para gerenciamento de dependências e Docker para execução em contêineres de forma isolada e portável.

## Sobre o Projeto

Este projeto serve como um template e um campo de estudo para conceitos fundamentais de Java. Ele contém diferentes programas simples, cada um com sua própria finalidade, e é configurado para ser construído e executado de forma padronizada usando ferramentas modernas de desenvolvimento.

Os programas incluídos são:
* **CalculadoraTabuada:** Calcula a tabuada de um número fornecido pelo usuário.
* **InputNomeIdade:** Recebe o nome e a idade do usuário e exibe uma saudação.
* **Programa3 e Programa4:** Exemplos adicionais para futuras implementações.

## Tecnologias Utilizadas

* **Java 21:** Versão LTS mais recente da linguagem.
* **Maven Wrapper:** Garante uma versão consistente do Maven para a construção do projeto.
* **JUnit 5:** Para a implementação de testes unitários.
* **Docker & Docker Compose:** Para criar imagens e executar os programas em contêineres.

## Pré-requisitos

Para executar este projeto, você precisará ter instalado em sua máquina:
* [Docker](https://www.docker.com/get-started)
* [Docker Compose](https://docs.docker.com/compose/install/) (geralmente já vem com o Docker Desktop)

> **Observação:** Não é necessário ter o Maven instalado localmente, pois o projeto utiliza o Maven Wrapper (`mvnw`).

## Como Executar

Siga os passos abaixo para executar qualquer um dos programas.

**1. Clone o repositório:**
```sh
git clone [https://github.com/lucasrosasc/Java_Fundamentals.git](https://github.com/lucasrosasc/Java_Fundamentals.git)
```

**2. Navegue até o diretório do projeto:**
```sh
cd Java_Fundamentals
```

**3. Execute usando Docker Compose (Método Recomendado):**

O Docker Compose já está configurado com "atalhos" para cada programa. Este método irá construir a imagem Docker (se ela ainda não existir) e executar o programa desejado de forma interativa.

* **Para executar a Calculadora de Tabuada:**
    ```sh
    docker-compose run --rm tabuada
    ```

* **Para executar o Input de Nome e Idade:**
    ```sh
    docker-compose run --rm input
    ```

* **Para executar os outros programas:**
    ```sh
    docker-compose run --rm programa3
    docker-compose run --rm programa4
    ```

> O parâmetro `--rm` é uma boa prática que remove o contêiner após sua execução, mantendo seu ambiente limpo.

---
### Executando com Docker (Método Alternativo)

Se preferir não usar o Docker Compose, você pode construir a imagem e executá-la manualmente.

**1. Construa a imagem Docker:**
```sh
docker build -t basic-app .
```

**2. Execute o programa desejado:**

Você precisa passar o nome completo da classe como um comando.

```sh
# Exemplo para a Calculadora de Tabuada
docker run -it --rm basic-app br.com.basic.CalculadoraTabuada

# Exemplo para o Input de Nome e Idade
docker run -it --rm basic-app br.com.basic.InputNomeIdade
```

## Testes

O projeto está configurado com JUnit 5. Para rodar os testes unitários (se houver), utilize o Maven Wrapper:

```sh
# No Windows
./mvnw.cmd test

# No Linux ou macOS
./mvnw test
```
## Project Structure
```
├── .mvn/                   # Pasta do Maven Wrapper
├── src/
│   └── main/
│       └── java/
│           └── br/
│               └── com/
│                   └── basic/
│                       ├── CalculadoraTabuada.java # Um dos programas executáveis
│                       ├── InputNomeIdade.java   # Outro programa executável
│                       ├── Programa3.java        # Classe para futuras implementações
│                       └── Programa4.java        # Classe para futuras implementações
├── .dockerignore           # Arquivos a serem ignorados pelo Docker
├── .gitignore              # Arquivos a serem ignorados pelo Git
├── docker-compose.yml      # Arquivo de orquestração do Docker Compose
├── Dockerfile              # Receita para construir a imagem Docker
├── mvnw                    # Script do Maven Wrapper (Linux/macOS)
├── mvnw.cmd                # Script do Maven Wrapper (Windows)
├── pom.xml                 # Arquivo de configuração do projeto Maven
└── README.md               # Documentação do projeto (este arquivo)
```
-----

Feito com ❤️ por **Lucas Rosas**.

[LinkedIn](https://www.linkedin.com/in/lucas-rosas-da-cunha/) | [GitHub](https://github.com/lucasrosasc)
