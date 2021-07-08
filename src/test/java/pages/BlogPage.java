package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.DriverFactory.getDriver;

public class BlogPage {

    WebElement procurar;

    public void acessarBlogSOC() {
        getDriver().get("https://ww2.soc.com.br/blog/");
    }

    public void encontrarCampoDeBusca() {
        procurar = getDriver().findElement(By.xpath("(//input[@placeholder='Procurar'])[3]"));
        procurar.click();
    }

    public void inserirTextoNoCampoDeBusca(String texto) {
        procurar.sendKeys(texto);
    }

    public void clicarNoBotaoPesquisar() {
        getDriver().findElement(By.xpath("//button[@title='Search']")).click();
    }

}
