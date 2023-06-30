package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class RegisterPage {
	WebDriver driver;
	ElementUtils elementUtils;
	
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		elementUtils=new ElementUtils(driver);
		
	}
	@FindBy(id="input-firstname")
	private WebElement firstnamefield;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-telephone")
	private WebElement telephonefield;
	
	@FindBy(id="input-password")
	private WebElement passwordfield;
	
	@FindBy(id="input-confirm")
	private WebElement psswordConfirm;
	
	@FindBy(name="agree")
	private WebElement privacypolicy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement clicontinue;
	
	@FindBy(xpath="//input[@name='newsletter' and @value=1]")
	private WebElement selectNewsLetter;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement warningMessage;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement warningmessge;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstnameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastnamewarning;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailwarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephonewarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordwarning;
	
	
	
	public void enterFirstName(String firstName) {
		elementUtils.typeTextIntoElement(firstnamefield, firstName, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		
	}
	public void enterLastName(String enterlastNameField){
		elementUtils.typeTextIntoElement(lastNameField, enterlastNameField, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	
	}
	public void enterEmailField(String emailAddress) {
		elementUtils.typeTextIntoElement(emailfield, emailAddress, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
		
	}
	public void entertelephone(String telephonetext) {
		elementUtils.typeTextIntoElement(telephonefield, telephonetext, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	}
	public void enterPasswordField(String passwordText) {
		elementUtils.typeTextIntoElement(passwordfield, passwordText, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	}
	
	public void enterPasswordConfirm(String confirmpasswordfield) {
		elementUtils.typeTextIntoElement(psswordConfirm, confirmpasswordfield, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	}
    public void selectPrivacyPolicyField() {
    	elementUtils.clickOnElement(privacypolicy, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    }
    public void selectContinueButton() {
    	elementUtils.clickOnElement(clicontinue, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    }
    public void selectNewsletterField() {
    	elementUtils.clickOnElement(selectNewsLetter, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    }
    public String getWarningMessage() {
    	return elementUtils.getTextFromElement(warningMessage, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    	
    }
    public String firstWarning() {
    	return elementUtils.getTextFromElement(warningMessage, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    	
    }
    public String firstnamewarningfiled() {
    	return elementUtils.getTextFromElement(firstnameWarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME); 
    }
    public String lastwarningfield() {
    	return elementUtils.getTextFromElement(lastnamewarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    	
    }
    public String emailwarningfield() {
    	return elementUtils.getTextFromElement(emailwarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    	
    }
    public String telephonewarningfield() {
    	return elementUtils.getTextFromElement(telephonewarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    }
    public String passwordwarningfield() {
    	return elementUtils.getTextFromElement(passwordwarning, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
    		
    }
    
}
