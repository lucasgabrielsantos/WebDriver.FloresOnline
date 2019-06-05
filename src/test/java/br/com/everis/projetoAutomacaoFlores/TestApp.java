package br.com.everis.projetoAutomacaoFlores;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestApp {
	
static WebDriver driver;
	
	@org.junit.Before
	public void testUsuario() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\lgabriel\\drivers\\chromedriver.exe");
		
		
        //Iniciando o Browser e configurando para maximizar.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        
        //Realizando a pesquisando no navegador.
        driver.get("https://www.google.com");
        
	}
	
	@Test
	
	public void testPesquisa() throws InterruptedException {
		
			//Pesquisando Flores Online na web.
		 	driver.findElement(By.name("q")).sendKeys("Flores Online");
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        //Realizando Cadastro no Flores Online .
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
        
       //Inserindo os dados.
        driver.findElement(By.xpath("//div[@id=\"general-login-ajax-content\"]//a[@class=\"texto-grande texto-verde\"]")).click();
        driver.findElement(By.id("email_lp")).sendKeys("lucasgabrielsantos12345@outlook.com");
        driver.findElement(By.id("nome_lp")).sendKeys("Lucas Gabriel");
        driver.findElement(By.id("telefone_lp")).sendKeys("11999999999");
        driver.findElement(By.id("senha_lp")).sendKeys("1234567890*");
        
        Thread.sleep(5000);
        
        driver.quit();
	
	
	}	
    
}
	