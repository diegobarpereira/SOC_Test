package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class SocNetPage {
    public void verificarTextoPaginaSocNet() {
        String textoProcurado = getDriver().findElement(By.xpath("//h2")).getText();
        Assert.assertEquals("Rede Credenciada SOCNET:\n" +
                "a maior rede colaborativa de Serviços Ocupacionais do Brasil.", textoProcurado);
    }

    public void clicarNoLinkBuscarCredenciados() {
        getDriver().findElement(By.xpath("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[4]/div/div/a/span/span")).click();
    }
}
