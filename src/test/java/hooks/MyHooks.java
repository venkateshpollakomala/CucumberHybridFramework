package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigaReader;
 

public class MyHooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		Properties prop = ConfigaReader.initializeProperties();
		driver=driverFactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
	}
	
	@After 
	public void teardown(Scenario scenario) {
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if(scenario.isFailed()) {
		 byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		driver.quit();
		
	}

}
