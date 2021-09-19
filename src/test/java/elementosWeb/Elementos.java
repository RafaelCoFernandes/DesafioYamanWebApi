package elementosWeb;

import org.openqa.selenium.By;

public class Elementos {

	private By barraBusca = By.name("q");
	private By escolherProduto = By.xpath("//*[span='Bolsa Couro Shoestock Saddle Travel Croco Feminina']");
	private By clicarComprar = By.id("buy-button-now");
	private By validarNomeProduto = By.xpath("//h3[@class='name']");
	
	public By getBarraBusca() {
		return barraBusca;
	}
	public By getEscolherProduto() {
		return escolherProduto;
	}
	public By getClicarComprar() {
		return clicarComprar;
	}
	public By getValidarNomeProduto() {
		return validarNomeProduto;
	}
	
}
