package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	elementUtils=new ElementUtils(driver);

	}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement MyAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	private WebElement clicksearch;
	
	
	
	public void clickonMyAccount() {
		elementUtils.clickOnElement(MyAccountDropMenu, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		
	}
	public LoginPage SelectloginOption() {
		elementUtils.clickOnElement(loginOption,commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		return new LoginPage(driver);
	}
	public RegisterPage clickregisteroption() {
		elementUtils.clickOnElement(registerOption, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		registerOption.click();
		return new RegisterPage(driver);
	}
	public void enterproductseaecBox(String productText) {
		elementUtils.typeTextIntoElement(searchbox, productText, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		
		
	}
	public searchResultsPage clickonserchbox() {
		elementUtils.clickOnElement(clicksearch, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		return new searchResultsPage(driver);
  }
	
}

