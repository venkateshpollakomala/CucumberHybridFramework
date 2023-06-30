package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class LoginPage {
  WebDriver driver;
  ElementUtils elementUtils;
  
  public LoginPage(WebDriver driver) {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
	  elementUtils=new ElementUtils(driver);
  }
  @FindBy(id="input-email")
  private WebElement emailField;
  
  @FindBy(id="input-password")
  private WebElement passwordfield;
  
  @FindBy(xpath="//input[@value='Login']")
  private WebElement Login;
  
  
  @FindBy(id="input-email")
  private WebElement invalidEmail;
  
  @FindBy(id="input-password")
  private WebElement invalidpasswordfield;
  
  @FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
  private WebElement getWarning;
  
  
  public void EnterEmailAddress(String emailText) {
	  elementUtils.typeTextIntoElement(emailField, emailText, commonUtils.IMPLICIT_WAIT_BASIC_TIME);	  
  }
  public void enterPasswordField(String passwordText) {
	  elementUtils.typeTextIntoElement(passwordfield, passwordText, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
  }
  
  public AccountPage loginOption() {
	  elementUtils.clickOnElement(Login, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	  return new AccountPage(driver);
  }
  public void invalidEmailfield(String invalidmail) {
	  elementUtils.typeTextIntoElement(invalidEmail, invalidmail, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	  
  }
  public void enterinvalodpassword(String invalidpassword) {
	  elementUtils.typeTextIntoElement(invalidpasswordfield, invalidpassword, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	  
	  
	  
  }
  public String getproperwarningMessage() {
	  return elementUtils.getTextFromElement(getWarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	 
  }
}
