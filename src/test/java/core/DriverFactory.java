package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    //private DriverFactory() {}

    public DriverFactory() {

    }


    public static WebDriver getDriver() {
        if (driver == null) {
            switch (Properties.browser) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;
            }
            driver.manage().window().setSize(new Dimension(1366, 768));
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void killDriver() {
        if( driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
