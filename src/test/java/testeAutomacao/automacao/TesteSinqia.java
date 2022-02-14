package testeAutomacao.automacao;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSinqia {
    WebDriver driver;
   // Driver driverWeb;

    @Before
    public void inicializaNavegador(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://blogdoagi.com.br/");

    }
    @Test
    public void pesquisaPorPalavra() {
        String xpathPesquisa = "//*[@id=\"search-open\"]";
        WebElement pesquisa = driver.findElement(By.xpath(xpathPesquisa));


        pesquisa.click();
        String xpathDigitaPesquisa = "//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input";
        WebElement digitaPesquisa = driver.findElement(By.xpath(xpathDigitaPesquisa));
        digitaPesquisa.click();
        digitaPesquisa.sendKeys("Casa");

        String xpathBtnPesquisa = "//*[@id=\"masthead\"]/div[1]/div[2]/form/input";
        WebElement btnPesquisa = driver.findElement(By.xpath(xpathBtnPesquisa));
        btnPesquisa.click();

    }
    @Test
    public void pesquisaSemPalavra(){
        String xpathPesquisa = "//*[@id=\"search-open\"]";
        WebElement pesquisa = driver.findElement(By.xpath(xpathPesquisa));


        pesquisa.click();
        String xpathDigitaPesquisa = "//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input";
        WebElement digitaPesquisa = driver.findElement(By.xpath(xpathDigitaPesquisa));
        digitaPesquisa.click();
        digitaPesquisa.sendKeys("");

        String xpathBtnPesquisa = "//*[@id=\"masthead\"]/div[1]/div[2]/form/input";
        WebElement btnPesquisa = driver.findElement(By.xpath(xpathBtnPesquisa));
        btnPesquisa.click();
    }


    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
