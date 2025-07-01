# 1. Escolher uma imagem base com Java (JDK) para compilar nosso código
# A tag "slim" é uma versão mais leve da imagem
FROM openjdk:11-slim

# 2. Definir um diretório de trabalho dentro do contêiner
WORKDIR /app

# 3. Copiar o pom.xml e o código-fonte para o contêiner
# Copiamos tudo do nosso projeto para o diretório /app no contêiner
COPY . .

# 4. Executar o comando do Maven para compilar o projeto e criar o JAR
# Este comando irá baixar as dependências e empacotar tudo no JAR
RUN mvn clean package

# 5. Definir o ponto de entrada (ENTRYPOINT)
# Este é o comando base que será executado quando o contêiner iniciar.
# Ele executa o Java, usando o JAR que criamos como classpath (-cp).
# Note que o comando está incompleto: ele espera um argumento, que será o nome da classe.
ENTRYPOINT ["java", "-cp", "target/Basic-1.0-SNAPSHOT-jar-with-dependencies.jar"]
