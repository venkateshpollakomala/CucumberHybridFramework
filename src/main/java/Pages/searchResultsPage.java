package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;
import utils.commonUtils;

public class searchResultsPage {
	WebDriver driver;
	private ElementUtils elementutils;
	
	public searchResultsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutils=new ElementUtils(driver);
	}
	@FindBy(linkText="HP LP3065")
	private WebElement validproduct;
	
	@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
	private WebElement messagetext;
	
public boolean displayvalidproduct() {
	return elementutils.displayStatusofElement(validproduct, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
}

public String getMesageTex() {
	return elementutils.getTextFromElement(messagetext, commonUtils.IMPLICIT_WAIT_BASIC_TIME);
	
}
}

