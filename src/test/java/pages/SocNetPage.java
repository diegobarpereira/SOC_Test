package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class SocNetPage {
    public void verificarTextoPaginaSocNet() {
        String textoProcurado = getDriver().findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]")).getText();
        Assert.assertEquals("Rede Credenciada SOCNET:\n" +
                "a maior rede colaborativa de Serviços Ocupacionais do Brasil.", textoProcurado);
    }

    public void clicarNoLinkBuscarCredenciados() {
        getDriver().findElement(By.xpath("//span[@class='elementor-button-text']//parent::span[1]//*[text()='Buscar credenciados']")).click();
    }
}
