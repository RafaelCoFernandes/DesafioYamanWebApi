$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/yamanApiTest.feature");
formatter.feature({
  "name": "Buscar pelo nome de um profissional na lista.",
  "description": "   Como usuario quero validar a busca do profissional via API.",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@executa"
    }
  ]
});
formatter.background({
  "name": "Acessar a API.",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que eu acesse a API \"https://api.trello.com/1/actions/592f11060f95a3d3d46a987a\" para buscar pelo nome do Profissional.",
  "keyword": "Dado "
});
formatter.match({
  "location": "testes.StepsApi.que_eu_acesse_a_API_para_buscar_pelo_nome_do_Profissional(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar o nome do Profissional na estrutura body response - estrutura (list), campo (name).",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@executa"
    }
  ]
});
formatter.step({
  "name": "após exibir o nome contido no campo (name).",
  "keyword": "Quando "
});
formatter.match({
  "location": "testes.StepsApi.após_exibir_o_nome_contido_no_campo_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o nome \"Professional\".",
  "keyword": "Entao "
});
formatter.match({
  "location": "testes.StepsApi.valido_o_nome(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Acessar a API.",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que eu acesse a API \"https://api.trello.com/1/actions/592f11060f95a3d3d46a987a\" para buscar pelo nome do Profissional.",
  "keyword": "Dado "
});
formatter.match({
  "location": "testes.StepsApi.que_eu_acesse_a_API_para_buscar_pelo_nome_do_Profissional(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar Status Code.",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@executa"
    }
  ]
});
formatter.step({
  "name": "valido o status code de retorno.",
  "keyword": "Entao "
});
formatter.match({
  "location": "testes.StepsApi.valido_o_status_code_de_retorno()"
});
formatter.result({
  "status": "passed"
});
});