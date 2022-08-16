# Spring Boot
Repositório de estudo sobre Spring Boot e JPA

## Serializable
- É uma interface que diz que os objetos da classe poderão ser convertidos para um sequência de bytes, sendo assim, podendo ser trafegados em redes, gravados em arquivos e assim por diante.

## Diferença de service, repositories e controller
- **Repository** é um Design Pattern onde os dados são obtidos do banco de dados e ocorre também a regra de negócio. Este retorna objetos de domínio que seriam as Entidades (classes anotadas com @Entity).

- **DAO** é outro Design Pattern onde somente há a comunicação com o banco de dados sem regra de negócio.

- **Service** seria outro Desing Pattern onde há somente a regra de negócio e não tem acesso direto ao banco de dados.

- **Controller** Ele é utilizado para lidar com a ligação da View com as outras partes do sistema que são a regra de negócio e banco de dados.
