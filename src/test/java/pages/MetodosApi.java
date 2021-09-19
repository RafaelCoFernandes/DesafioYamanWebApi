package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MetodosApi {

	Response response;

	public Response acessarApi(String uri) {

		response = RestAssured.get(uri);

		return response;
	}

	public String exibirNome() {

		JsonPath jsonPathEvaluator = response.jsonPath();
		String nome = jsonPathEvaluator.get("data.list.name");

		return nome;

	}

	@SuppressWarnings("deprecation")
	public void validarNome(String texto) {

		String bodyResponse = response.asString();
		assertThat(bodyResponse, StringContains.containsString(texto));

	}

	public void ValidarStatusCode(int status) {

		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);

	}

}
