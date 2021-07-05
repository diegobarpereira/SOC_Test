package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.DriverFactory.getDriver;

public class BlogPage {

    WebElement procurar;

    public void acessarBlogSOC() {

        getDriver().get("https://ww2.soc.com.br/blog/");

    }

    public void encontrarCampoDeBusca() {
        procurar = getDriver().findElement(By.xpath("//div[2]/div/div/div/div/form/div/input"));
        procurar.click();
    }

    public void inserirTextoNoCampoDeBusca(String texto) {
        procurar.sendKeys(texto);
    }

    public void clicarNoBotaoPesquisar() {
        getDriver().findElement(By.cssSelector(".elementor-search-form__submit > .fa")).click();
    }

    public void verificarTextoProcurado() {
        String textoProcurado = getDriver().findElement(By.xpath("//h2")).getText();
        Assert.assertEquals("Search Results for: SOC realiza treinamento interno para lideranças", textoProcurado);

    }


}
