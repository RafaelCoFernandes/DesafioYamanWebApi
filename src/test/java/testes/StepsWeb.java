package testes;

import java.io.IOException;

import elementosWeb.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.MetodosWeb;

public class StepsWeb {

	MetodosWeb metodos = new MetodosWeb();
	Elementos elementos = new Elementos();
	
	@Dado("que eu esteja no site da loja Shoestock {string}.")
	public void que_eu_esteja_no_site_da_loja_Shoestock(String site) throws IOException {
	  
		metodos.abrirNavegador(site);
		
	}

	@Quando("digitar o produto {string} na barra de busca e entrar.")
	public void digitar_o_produto_na_barra_de_busca_e_entrar(String texto) throws IOException, InterruptedException {
	    
		Thread.sleep(5000);
		metodos.escreverEentrar(elementos.getBarraBusca(), texto);
		
	}

	@E("escolher por um dos produtos selecionados.")
	public void escolher_por_um_dos_produtos_selecionados() throws InterruptedException, IOException {
	    
		Thread.sleep(5000);
		metodos.clicar(elementos.getEscolherProduto());
		
	}
	
	@E("clicar em comprar.")
	public void clicar_em_comprar() throws InterruptedException, IOException {
	   
		Thread.sleep(5000);
		metodos.clicar(elementos.getClicarComprar());
		
	}

	@Entao("valido o nome do produto {string} no carrinho de compras.")
	public void valido_o_nome_do_produto_no_carrinho_de_compras(String textoEsperado) throws IOException, InterruptedException {
	    
		Thread.sleep(5000);
		metodos.validarInformacao(elementos.getValidarNomeProduto(), textoEsperado);
		metodos.fecharNavegador();
		
	}
	
}
