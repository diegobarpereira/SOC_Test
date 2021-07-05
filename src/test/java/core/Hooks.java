package core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks extends DriverFactory {
    String scenarioName = null;

    public Hooks() {
        super();
    }

    @Before
    public void setUp(Scenario scenario){
        scenarioName = scenario.getName();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator + scenarioName + ".jpg"));

        byte[] ssReport = ss.getScreenshotAs(OutputType.BYTES);
        scenario.attach(ssReport, "image/png", scenarioName);


        if (Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}




