package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class AccountPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	public AccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		elementUtils=new ElementUtils(driver);
	}
		
		@FindBy(linkText="Edit your account information")
		private WebElement edityourAccount;
		
		public boolean displayStatusOfEditYourAccontInformationOption() {
			return elementUtils.displayStatusofElement(edityourAccount, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		}
		
	
	
	

}
