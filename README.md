# Lojinha API Automação
Automação de teste com Junit e RestAssured.

Esse é um repositório que contém a automação de alguns testes de API Rest de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Técnologias Utilizadas
* [Intellij](https://www.jetbrains.com/idea/download/?section=windows) 
* [Java](https://www.oracle.com/br/java/technologies/downloads/#jdk22-windows)
* [Maven](https://maven.apache.org/)
* [JUnit](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.11.0-M2):
* [RestAssured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured/5.5.0)
* [Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)

* [Instalação e Configuração Maven](https://www.youtube.com/watch?v=-ucX5w8Zm8s&ab_channel=LoianeGroner)

## Testes Automatizados
Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

## Notas Gerais
- Sempre utilizamos a notação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Armazenamos os dados enviados para a API através do uso de classes POJO.
- Criamos dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos.
- Nesse projeto utilizamos a notação DisplayName para dar descrições em português para nossos testes.