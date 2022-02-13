# API RESTful utilizada para testes

Esta é uma API, seguindo os conceitos RESTful, desenvolvida em Java com o Spring Framework 
e utiliza de dados ficticios e sem ligação com quaisquer empresas ou grupos ,para simular 
uma webapp de ecommerce simples, fazendo uso de endpoints e requisições HTTP mais utilizadas


<img src="{ttps://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white}" />
<img src="{https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white}" />
<img src="{https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white}" />
<img src="{https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white}" />
<img src="{https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot}" />
<img src="{https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white}" />
<img src="{https://img.shields.io/badge/Pop!_OS-48B9C7?style=for-the-badge&logo=Pop!_OS&logoColor=white}}" />

------------------------------------------------------------------------------------------

O primeiro endpoint utiliza uma requisição do tipo GET e retorna todos os itens cadastrados

basta acessar o link: https://ecommerce-teste.herokuapp.com/items

------------------------------------------------------------------------------------------

O segundo endpoint também utiliza uma requisição do tipo GET e retorna itens específicos do
banco de dados passando como parâmetro da URL o id do item desejado.

basta acessar o link: https://ecommerce-teste.herokuapp.com/items/{id}

------------------------------------------------------------------------------------------

O terceiro endpoint utiliza uma requisição do tipo PUT e atualiza itens específicos do 
banco de dados, caso os mesmos existam, passando como parâmetro da URL o id do item desejado 
e um JSON como corpo da requisiçãp e no corpo, os campos: id, name, price, description e qtd.

basta acessar o link: https://ecommerce-teste.herokuapp.com/items/{id} passando o corpo 
(Utilizei a Ferramenta Postman para realizar as atualizações)

------------------------------------------------------------------------------------------

O quarto endpoint utiliza uma requisição do tipo POST e realiza inserções de novos itens no 
banco de dados, passando um JSON como corpo da requisiçãp e no corpo, os campos: id, name, 
price, description e qtd, sendo o id, chave primária do banco e necessitanto ser uma que não
já está previamente no banco de dados (Utilizar o primeiro endpoint para ajudar)

basta acessar o link: https://ecommerce-teste.herokuapp.com/items/  passando o corpo 
(Utilizei a Ferramenta Postman para realizar as atualizações)

------------------------------------------------------------------------------------------
