package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosWeb {

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	WebDriver driver;

	public void abrirNavegador(String site) throws IOException {

		try {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is: " + projectPath);
			System.setProperty("webdriver.chrome.driver",
					projectPath + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		}

		catch (WebDriverException e) {

			System.out.println("  Erro ao acessar o site, " + "data e hora: " + dtf.format(LocalDateTime.now())
					+ " erro: " + e.toString());
			screenShot("error/" + "Erro ao acessar o site.");
		}

	}

	public void escreverEentrar(By elementos, String texto) throws IOException {

		try {

			driver.findElement(elementos).sendKeys(texto);
			driver.findElement(elementos).submit();

		}

		catch (NoSuchElementException e) {

			System.out.println("  Erro ao inserir o texto: " + texto + ", data e hora: "
					+ dtf.format(LocalDateTime.now()) + " erro: " + e.toString());
			screenShot("error/" + "Erro ao inserir texto.");
		}
	}

	public void clicar(By elementos) throws IOException {

		try {

			driver.findElement(elementos).click();

		}

		catch (NoSuchElementException e) {

			System.out.println("  Erro ao clicar, " + "data e hora: " + dtf.format(LocalDateTime.now()) + " erro: "
					+ e.toString());
			screenShot("error/" + "Erro ao clicar.");
		}

	}

	public void validarInformacao(By elementos, String textoEsperado) throws IOException {

		try {

			String texto = driver.findElement(elementos).getText();
			assertEquals(texto, textoEsperado);

			if (!texto.equals(textoEsperado)) {

				screenShot("error/" + "Erro ao validar produto.");

			}

			else {

				screenShot("Produto Validado");
			}

		}

		catch (ComparisonFailure e) {

			System.out.println("  Erro ao validar produto, " + "data e hora: " + dtf.format(LocalDateTime.now())
					+ " erro: " + e.toString());
			screenShot("error/" + "Erro ao validar produto.");

		}

		catch (NoSuchElementException e) {

			System.out.println("  Erro ao validar produto, " + "data e hora: " + dtf.format(LocalDateTime.now())
					+ " erro: " + e.toString());
			screenShot("error/" + "Erro ao validar produto.");

		}

	}

	public void screenShot(String validacao) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + validacao + ".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void fecharNavegador() {

		driver.quit();

	}

}
