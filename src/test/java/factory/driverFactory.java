package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.commonUtils;

public class driverFactory {
	static WebDriver driver ;
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browserName.equals("firfox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			 driver=new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonUtils.PAGE_LOAD_TIME));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonUtils.IMPLICIY_WAIT_TIME));
		return driver;
	}
	public static WebDriver getDriver() {
		return driver;
	}

}
