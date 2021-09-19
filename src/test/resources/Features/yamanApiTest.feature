#language: pt
#Autor rafaelfernandesxcvii@gmail.com - Desafio API - Yaman
@executa
Funcionalidade: Buscar pelo nome de um profissional na lista.
  
   Como usuario quero validar a busca do profissional via API.

  Contexto: Acessar a API.
    Dado que eu acesse a API "https://api.trello.com/1/actions/592f11060f95a3d3d46a987a" para buscar pelo nome do Profissional.

  Cenário: Validar o nome do Profissional na estrutura body response - estrutura (list), campo (name).
    Quando após exibir o nome contido no campo (name).
    Entao valido o nome "Professional".

  Cenário: Validar Status Code.
    Entao valido o status code de retorno.
