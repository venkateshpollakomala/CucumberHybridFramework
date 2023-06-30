package stepdefinations;

import org.openqa.selenium.WebDriver;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import factory.driverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {
	private LoginPage loginpage;
	WebDriver driver;
	@Given("User has navigate to login page")
	public void User_has_navigate_to_login_page() {
		driver=driverFactory.getDriver();
		HomePage homepage=new HomePage(driver);
		homepage.clickonMyAccount();
		homepage.SelectloginOption();
		
	}
	@When("User has enter valid emailaddress {string} in to email field")
public void User_has_enter_valid_emailaddress_in_to_email_field(String emailText) {
		 loginpage=new LoginPage(driver);
		loginpage.EnterEmailAddress(emailText);
	
}
	@And("User has enter valid password {string} in to password field")
	public void User_has_enter_valid_password_in_to_password_field(String passwordText) {
		loginpage.enterPasswordField(passwordText);
		
	}
	@And("User clicks on login button")
	public void User_clicks_on_login_button() {
		loginpage.loginOption();
		
	}
	 
	@Then("User should get successfully logged in")
	public void User_should_get_successfully_logged_in() {
		AccountPage accountpage=new AccountPage(driver);
		Assert.assertTrue(accountpage.displayStatusOfEditYourAccontInformationOption());
		
	}
	@When("User has enter invalid emailaddress {string} in to email field")
	public void user_has_enter_invalid_emailaddress_in_to_email_field(String invalidmail) {
		
		loginpage.invalidEmailfield(invalidmail);
	}

	@When("User has enter invalid password {string} in to password field")
	public void user_has_enter_invalid_password_in_to_password_field(String invalidpassword) {
	    loginpage.enterinvalodpassword(invalidpassword);
	}

	@Then("User should get proper warning message about credentials mismatch")
	public void user_should_get_proper_warning_message_about_credentials_mismatch() {
		Assert.assertTrue(loginpage.getproperwarningMessage().contains("Warning: No match for E-Mail Address and/or Password."));
	    
	}

	@When("User dont enter emailaddress in to email field")
	public void user_dont_enter_emailaddress_in_to_email_field() {
		loginpage=new LoginPage(driver);
	    loginpage.EnterEmailAddress("");
	}

	@When("User dont enter password in to password field")
	public void user_dont_enter_password_in_to_password_field() {
		loginpage.enterPasswordField("");
		
	   
	}
}
