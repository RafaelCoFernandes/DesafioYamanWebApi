# Desafio Yaman - Testes de API e Web
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RafaelCoFernandes/DesafioYamanWebApi/blob/master/LICENSE) 
# 1) Sobre o projeto

O projeto possui duas vertentes, testes Web e de Api. Nos testes Web usaremos as ferramentas Selenium/Cucumber/JUnit com BDD. Na execução dos testes de API, usaremos RestAssured.

 - Web
 
Na condição de usuário, devemos realizar buscas pelo site, a fim de encontrar o produto desejado. Enquanto QA, devemos verificar se o site funciona corretamente de acordo com a funcionalidade a ser testada.

- API

Através dos testes de API, devemos validar se o nome presente no Body Response e o Status Code do retorno estão de acordo com o esperado.

# 2) Tecnologias utilizadas nos Testes Web
- BDD;
- Gherkin;
- Cucumber;
- Selenium WebDriver;
- JUnit;
- Java 11;

## Casos de teste

![CasosDeTeste](https://user-images.githubusercontent.com/81786010/133911374-a3bc6d98-4cce-4d12-abc2-0588425ebb7a.png)

# 3) Tecnologias utilizadas nos Testes de API
- RestAssured;
- JUnit;
- Java 11;

## API utilizada

![API](https://user-images.githubusercontent.com/81786010/133911403-32fc3395-d980-4eee-85d4-8a54926cc4af.png)

# 4) Dependências Utilizadas nos Testes Web e de API
| Plugin | Mais informações |
| ------ | ------ |
| Cucumber | [https://mvnrepository.com/artifact/io.cucumber/cucumber-java]|
| JUnit | [https://mvnrepository.com/artifact/junit/junit] |
| Selenium | [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java]|
| Ashot | [https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot] |
| RestAssured | [https://mvnrepository.com/artifact/io.rest-assured/rest-assured] |

# 5) Como executar o projeto

# Clonar Repositório

- No seu terminal GIT insira o código abaixo:

```bash
git clone https://github.com/RafaelCoFernandes/DesafioYamanWebApi.git
```
Após clonar o projeto, basta executa-lo diretamente.

- Obs Importantes

Caso o produto utilizado como exemplo no teste Web não esteja mais presente no site, pois as mudanças são contínuas, basta pesquisar por outro produto na documentação Cucumber e alterar o elemento correspondente do site Shoestock na classe "ElementosWeb".

O projeto possui tratamento de exceções para eventuais erros de escrita ou elementos não encontrados, porém os erros gerados estão devidamente explícitos no console.

# Autor

Rafael Coelho Fernandes

- Linkedin: 
www.linkedin.com/in/rafael-fernandes-QA1997
