package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class HomePage {

    public void acessarPaginaPrincipal() {
         getDriver().get("https://www.soc.com.br/");
    }

    public void clicarEmAceitarCookies() {
        getDriver().findElement(By.xpath("/html/body/div[3]/div/section[3]/div/div/div[2]/div/div/div/div/div/a/span/span")).click();
    }

    public void clicarNoLinkSocNet() {
        getDriver().findElement(By.xpath("/html/body/div[2]/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div/div/section/div/div[2]/div/div/div[3]/div/div")).click();
    }





}
