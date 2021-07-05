package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class RedeCredPage {
    public void inserirCEPValido() {
        getDriver().findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11015-012");
    }

    public void clicarNoBotaoPesquisar() {
        getDriver().findElement(By.id("botao-buscar")).click();
    }

    public void verificarPrestadorCredenciado() {
        String textoProcurado = getDriver().findElement(By.id("div-resultados-qtdd")).getText();
        Assert.assertTrue(textoProcurado.contains("Prestadores encontrados"));
    }
}
