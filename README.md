# API RESTful utilizada para testes

Esta é uma API, seguindo os conceitos RESTful, desenvolvida em Java com o Spring Framework 
e utiliza de dados ficticios e sem ligação com quaisquer empresas ou grupos ,para simular 
uma webapp de ecommerce simples, fazendo uso de endpoints e requisições HTTP mais utilizadas

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

# Aplicação React para teste de Ecommerce simples

Esta aplicação serve como estudo para gerenciamento de estados
utilizado a ContextAPI do React e para teste de integraçaõ com 
o BackEnd de uma API RESTful desenvolvida com o Spring Framework

------------------------------------------------------------------

Link da aplicação: https://ecommerce-ferramentas.herokuapp.com/

------------------------------------------------------------------

Em breve criarei um container para facilitar testes e deploy

## Ambiente de desenvolvimento:
      
      - Sistema operacional: Pop_OS!
      - Editor: VSCode
      - Navegador: Google Chrome
