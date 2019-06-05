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
        
        //Realizando login no Flores Online .
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a")).click();;
        driver.findElement(By.xpath("/html/body/section/div/div/nav/div/div/div")).click();
		
	}
    
}
