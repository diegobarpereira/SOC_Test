package TestRunners;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AppFeatures",
        glue = {"step_definitions", "core"},
        plugin = {"pretty",
                  "html:target/cucumber-reports.html",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                  "json:target/cucumber.json", "junit:target/cucumber.xml"}

)
public class TestRun {

    @AfterClass
    public static void finalizaTudo() {
        DriverFactory.killDriver();
    }

}
