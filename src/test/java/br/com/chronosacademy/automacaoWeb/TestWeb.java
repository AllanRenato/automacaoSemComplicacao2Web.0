package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class TestWeb {
    EdgeDriver driver;
    @Before
    public void inicializaTeste(){
        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }
    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[2]/div[3]//h4";
                              
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        txtTitulo.getText();
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo );
    }
    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
