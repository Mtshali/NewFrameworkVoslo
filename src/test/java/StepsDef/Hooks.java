package StepsDef;

import GlobalFunction.ActionClass;
import cucumber.api.Scenario;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utils.BaseClass;

public class Hooks extends BaseClass{

    @Before
    public void BeforeSteps(Scenario scenario) throws Exception{

        switch (getProperties().getProperty("broswer")){

            default:
            ChromeOptions options = new ChromeOptions();
            if(BaseClass.getProperties().getProperty("chrome.headless").equalsIgnoreCase("true"))
                options.addArguments("--headless");
            ChromeDriver chromeDriver = new ChromeDriver(options);
            ActionClass.setDriver(chromeDriver);
        }
    }

}
