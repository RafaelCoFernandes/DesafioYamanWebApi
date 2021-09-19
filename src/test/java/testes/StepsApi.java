package testes;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.MetodosApi;

public class StepsApi {

	MetodosApi metodos = new MetodosApi();

	@Dado("que eu acesse a API {string} para buscar pelo nome do Profissional.")
	public void que_eu_acesse_a_API_para_buscar_pelo_nome_do_Profissional(String Api) {

		metodos.acessarApi(Api);

	}

	@Quando("após exibir o nome contido no campo \\(name).")
	public void após_exibir_o_nome_contido_no_campo_name() {

		System.out.println("  O nome contido no campo é " + "\"" + metodos.exibirNome() + "\"");

	}

	@Entao("valido o nome {string}.")
	public void valido_o_nome(String nome) {

		metodos.validarNome(nome);

	}

	@Entao("valido o status code de retorno.")
	public void valido_o_status_code_de_retorno() {

		metodos.ValidarStatusCode(200);

	}

}
