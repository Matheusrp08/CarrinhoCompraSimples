Quando se fala que os valores no checkout deveriam ser calculados dinamicamente eu pensei em uma tecnologia
Que nunca tinha trabalhado, o angular JS para fazer está parte do teste
Usei o spring para fazer todo o processo interno até enviar os dados do banco para o html
E usei um pouco de JavaScript para algumas funcionalidades da tabela, a parte de listar os produtos ainda tem 
Alguns detalhes que vou estar corrigindo e colocando aqui, porém até aqui fiz o que pude dentro do limite de tempo do teste, gosto de trabalhar 
Com o que já sei porém gosto muito de pegar alguma tecnologia que eu não saiba tanto, porque isso me motiva a 
Trabalhar com ela, espero que vocês gostem do que estou desenvolvendo, estou dando o meu melhor e aprendendo 
Com esse teste, afinal supera teste Matheus é o nome do banco de dados no MySql! Até breve, obrigado pela 
Oportunidade!


Gestão do carrinho através da interface web:
URL: http://< HOST >:9090/ Usuário: user Senha: matheus

Frameworks utilizados

Spring Boot, Spring MVC, Spring Data, Spring Security, Spring Test, MySQL DB, Angular, Thymeleaf, JQuery, CSS,
Bootstrap, HTML 5, Maven, GIT,

Usuário: user

Senha: secret123


Roteiro básico de instalação

Criar o schema "superatestematheus" na base de dados;

Definir um usuário com acesso de escrita e consulta ao novo schema;

Baixar código fonte:

git clone git@github.com:Matheusrp08/testesupera.git

Executar o script SQL que se encontra no diretório "sql";

Editar o arquivo "pom.xml" atualizando as configurações da base de dados e log do profile "dev";

Executar o seguinte comando onde se encontra o arquivo pom.xml:

mvn clean install

Executar o seguinte comando para inicializar a aplicação:

# Avaliação Java

## Descrição

O teste consiste em construir a camada de serviço de um pseudo ecommerce de games mobile utilizando Java

## Como executar os testes

O projeto usa o maven wrapper (mvnw). Para executar os testes de exemplo basta o comando abaixo:

  ```sh
  ./mvnw clean test
  ```

## Requisitos

- Existe um exemplo de carga de banco de dados em memória
  em [ProductDaoExampleTest.java](./src/test/java/br/com/supera/game/store/ProductDaoExampleTest.java)
- Os valores exibidos no checkout (frete, subtotal e total) devem ser calculados dinamicamente
- O usuário poderá adicionar e remover produtos do carrinho
- O usuário poderá ordenar os produtos por preço, popularidade (score) e ordem alfabética.
- A cada produto adicionado, deve-se somar R$ 10,00 ao frete.
- Quando o valor dos produtos adicionados ao carrinho for igual ou superior a R$ 250,00, o frete é grátis.

## O que iremos avaliar

Levaremos em conta os seguintes critérios:

- Cumprimento dos requisitos
- Qualidade do projeto de API e fluidez da DX
- Organização do código e boas práticas
- Domínio das linguagens, bibliotecas e ferramentas utilizadas
- Organização dos commits
- Escrita e cobertura de testes

## Sobre a entrega

- A API pode ser HTTP, Restful, WSDL/SOAP, HATEOAS ou gRCP mas deverá ser documentado no [README.md](./README.md) como
  executar/compilar/empacotar o projeto e quais os endpoints solicitados nos requisitos acima.
- A versão do Java pode ser atualizada para 11 ou 14.
- Não existe restrição de framework (EE, Spring, Quarkus etc) mas será melhor avaliado se justificado
  no [README.md](./README.md) os motivos da decisão.
