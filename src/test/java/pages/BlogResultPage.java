package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class BlogResultPage {
    public void verificarTextoProcurado() {
        String textoProcurado = getDriver().findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]")).getText();
        Assert.assertEquals("Search Results for: SOC realiza treinamento interno para lideranças", textoProcurado);
    }

}
