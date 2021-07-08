package pages;

import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class HomePage {

    public void acessarPaginaPrincipal() {
         getDriver().get("https://www.soc.com.br/");
    }

    public void clicarEmAceitarCookies() {
        getDriver().findElement(By.xpath("//span[@class='elementor-button-text']//parent::span[1]//*[text()='Aceitar cookies']")).click();
    }

    public void clicarNoLinkSocNet() {
        getDriver().findElement(By.xpath("(//a[@class='access-details'])[3]")).click();
    }

}
