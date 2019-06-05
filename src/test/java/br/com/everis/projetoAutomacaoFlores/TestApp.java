package br.com.everis.projetoAutomacaoFlores;

import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestApp {
	
static WebDriver driver;
	
	@org.junit.Before
	public void testUsuario() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\lgabriel\\drivers\\chromedriver.exe");
		
	
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
       
        driver.get("https://www.google.com");
        
	}
	
	@Test
	
	public void testPesquisa() throws InterruptedException {
		
			
		driver.findElement(By.name("q")).sendKeys("Flores Online");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
        
       
        driver.findElement(By.xpath("//div[@id=\"general-login-ajax-content\"]//a[@class=\"texto-grande texto-verde\"]")).click();
        driver.findElement(By.id("email_lp")).sendKeys("lucasgabrielsantos12345@outlook.com");
        driver.findElement(By.id("nome_lp")).sendKeys("Lucas Gabriel");
        driver.findElement(By.id("telefone_lp")).sendKeys("11999999999");
        driver.findElement(By.id("senha_lp")).sendKeys("1234567890*");
        
<<<<<<< HEAD
        
        driver.findElement(By.id("btnMain")).click();
        
        Thread.sleep(5000);
        
=======
>>>>>>> 4a82dfd967c03baef48507513d581968c47fb5f0
        driver.quit();
	
	
	}	
    

	@Test
	public void LoginExistente() throws InterruptedException {
		
		
		driver.findElement(By.name("q")).sendKeys("Flores Online");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
        
       
        driver.findElement(By.xpath("//div[@id=\"general-login-ajax-content\"]//a[@class=\"texto-grande texto-verde\"]")).click();
        driver.findElement(By.id("email_lp")).sendKeys("lucasgabrielsantos12345@outlook.com");
        driver.findElement(By.id("nome_lp")).sendKeys("Lucas Gabriel");
        driver.findElement(By.id("telefone_lp")).sendKeys("11999999999");
        driver.findElement(By.id("senha_lp")).sendKeys("1234567890*");
        
        
        driver.findElement(By.id("btnMain")).click();
        
        Thread.sleep(5000);
        
        driver.quit();
	
		}
	
	@Test
	public void LoginInvalido() throws InterruptedException {
		
		
		driver.findElement(By.name("q")).sendKeys("Flores Online");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        
        
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
        
       
        driver.findElement(By.xpath("//div[@id=\"general-login-ajax-content\"]//a[@class=\"texto-grande texto-verde\"]")).click();
        driver.findElement(By.id("email_lp")).sendKeys("everis");
        driver.findElement(By.id("nome_lp")).sendKeys("testing");
        driver.findElement(By.id("telefone_lp")).sendKeys("11999999999");
        driver.findElement(By.id("senha_lp")).sendKeys("1234567890*");
        
        
        driver.findElement(By.id("btnMain")).click();
		}
     
		@After
		public void finaliza() throws InterruptedException {
			
			Thread.sleep(5000);
	        
	        driver.quit();			
		}	
}

	