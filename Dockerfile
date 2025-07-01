# --- Estágio 1: Build ---
# Usa a imagem completa do OpenJDK com Maven para construir o projeto
FROM maven:3.9.10-amazoncorretto-24-debian-bookworm AS builder

# Define o diretório de trabalho
WORKDIR /app

# Copia o código-fonte
COPY . .

# Constrói o projeto usando o Maven Wrapper para garantir consistência
RUN chmod +x mvnw
RUN ./mvnw clean package


# --- Estágio 2: Produção ---
# Usa uma imagem JRE (Java Runtime Environment) muito menor, apenas para execução
FROM amazoncorretto:24-headful

# Define o diretório de trabalho
WORKDIR /app

# Copia APENAS o JAR final do estágio de build para a imagem final
COPY --from=builder /app/target/Basic-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

# Define o ponto de entrada para executar a aplicação
ENTRYPOINT ["java", "-cp", "app.jar"]
