package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class AccountSuccessPage {

	WebDriver driver;
	private ElementUtils elementUtils;
	
	public AccountSuccessPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		elementUtils= new ElementUtils(driver);
		
	}
	@FindBy(xpath="//div[@id='content']/p")
	private WebElement successmessage;
	
	public String getPageHeddingPage() {
		return elementUtils.getTextFromElement(successmessage, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		
		
	}
}
