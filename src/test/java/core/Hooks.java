package core;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks extends DriverFactory {

    public Hooks() {
        super();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(arquivo, new File("test-output" + File.separator + "screenshot" + File.separator + scenario.getName() + ".jpg"));

        byte[] ssReport = ss.getScreenshotAs(OutputType.BYTES);
        scenario.attach(ssReport, "image/png", "img");

        if (Properties.FECHAR_BROWSER) {
            killDriver();
        }
    }
}




