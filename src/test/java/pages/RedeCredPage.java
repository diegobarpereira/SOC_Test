package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class RedeCredPage {
    public void inserirCEPValido(String cep) {
        getDriver().findElement(By.id("ipt-busca-credenciado-2")).sendKeys(cep);
    }

    public void clicarNoBotaoPesquisar() {
        getDriver().findElement(By.id("botao-buscar")).click();
    }

    public void verificarPrestadorCredenciado() {
        String textoProcurado = getDriver().findElement(By.id("div-resultados-qtdd")).getText();
        Assert.assertTrue(textoProcurado.contains("Prestadores encontrados"));
    }
}
