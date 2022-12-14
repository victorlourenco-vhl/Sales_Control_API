# Spring Boot
Stack do projeto:
- Spring Boot
- Envio de e-mail
- SQL (MySQL)
- JPA
- Autenticação com JWT

## Diagrama de Classes
![diagrama-de-classes](https://user-images.githubusercontent.com/78964459/199051096-9c8b2511-d08c-496b-a08e-ac5ad63cd153.png)

## Diagram de Objetos
![diagrama-de-objetos](https://user-images.githubusercontent.com/78964459/199051219-0d81545a-8b77-4060-9345-7f673230f6d1.png)


## Serializable
- É uma interface que diz que os objetos da classe poderão ser convertidos para um sequência de bytes, sendo assim, podendo ser trafegados em redes, gravados em arquivos e assim por diante.

## Diferença de service, repositories e controller
- **Repository** é um Design Pattern onde os dados são obtidos do banco de dados e ocorre também a regra de negócio. Este retorna objetos de domínio que seriam as Entidades (classes anotadas com @Entity).

- **DAO** é outro Design Pattern onde somente há a comunicação com o banco de dados sem regra de negócio.

- **Service** seria outro Desing Pattern onde há somente a regra de negócio e não tem acesso direto ao banco de dados.

- **Controller** Ele é utilizado para lidar com a ligação da View com as outras partes do sistema que são a regra de negócio e banco de dados.

![image](https://user-images.githubusercontent.com/78964459/184904830-2831f962-b463-4161-8704-bf8e018584f6.png)

## Aplicação Web vs API RestFul
- a diferença fundamental entre um aplicativo web e uma API REST é que a resposta de um aplicativo da web é uma visualização geral de HTML + CSS + JavaScript enquanto a API REST apenas retorna dados em forma de JSON ou XML. 

## @Controller vs @RestController
- O trabalho do **@Controller** é criar um Map do model object e encontrar uma view, mas o **@RestController** simplesmente retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP como JSON ou XML.

## DTO
- Padrão Objeto de Transferência de Dados (do inglês, Data transfer object design pattern, ou simplesmente DTO) é um padrão de arquitetura de objetos que agregam e encapsulam dados para transferência.

## JPQL 
- Linguagem de consulta da JPA
- Similar à SQL, porém as consultas são expressas em "nível"
de objetos
- É obrigatória a atribuição de um "alias" (apelido) aos objetos pretendidos na consulta

- Retorna um cliente:
```
SELECT * FROM CLIENTE
```
- Retorna um List\<Cliente>
```
SELECT * obj FROM Cliente Obj
```
