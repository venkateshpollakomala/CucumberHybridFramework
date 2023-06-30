package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.AccountSuccessPage;
import Pages.HomePage;
import Pages.RegisterPage;
import factory.driverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registeration {
	WebDriver driver;
	RegisterPage registerpage;
	
	@Given("User has navigate to Register Account page")
	public void user_has_navigate_to_register_account_page() {
		driver=driverFactory.getDriver();
		HomePage homepage=new HomePage(driver);
		homepage.clickonMyAccount();
		homepage.clickregisteroption();
		}

	@When("User has enter the details into below fields")
	public void user_has_enter_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String, String> datamap = dataTable.asMap(String.class,String.class);
	    registerpage=new RegisterPage(driver); 
		registerpage.enterFirstName(datamap.get("firstName"));
		registerpage.enterLastName(datamap.get("LastName"));
		registerpage.enterEmailField(datamap.get("email"));
		registerpage.entertelephone(datamap.get("telephone"));
		registerpage.enterPasswordField(datamap.get("password"));
		registerpage.enterPasswordConfirm(datamap.get("password"));
	    
	}

	@When("User has select privacy policy")
	public void user_has_select_privacy_policy() {
		registerpage.selectPrivacyPolicyField();
	   
	}

	@When("User has clicks on continue button")
	public void user_has_clicks_on_continue_button() {
    registerpage.selectContinueButton();	    
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		AccountSuccessPage accounsuccess=new AccountSuccessPage(driver);
		Assert.assertEquals("Congratulations! Your new account has been successfully created!",accounsuccess.getPageHeddingPage());
	}

	@When("User has select yes for Newsletter")
	public void user_has_select_yes_for_newsletter() {
		registerpage.selectNewsletterField();		
	    
	}

	@Then("User should get proper waring message like it is dupicate") 
	public void user_should_get_proper_waring_message_like_it_is_dupicate() {
		Assert.assertTrue(registerpage.getWarningMessage().contains("Warning: E-Mail Address is already registered!"));
	  
	}

	@Given("User dont enter any details in to fields")
	public void user_dont_enter_any_details_in_to_fields() {
		RegisterPage registerpage =new RegisterPage(driver); 
	}

	

	@Then("Proper warning message should be display under every field")
	public void proper_warning_message_should_be_display_under_every_field() {
		Assert.assertTrue(registerpage.firstWarning().contains("Warning:You must agree to the privacy policy!"));
		Assert.assertEquals("First Name must be between 1 and 32 characters!",registerpage.firstnamewarningfiled());
		Assert.assertEquals("Last Name must be between 1 and 32 characters!",registerpage.lastwarningfield());
		Assert.assertEquals("E-Mail Address does not appear to be valid!",registerpage.emailwarningfield());
		Assert.assertEquals("Telephone must be between 3 and 32 characters!",registerpage.telephonewarningfield());
		Assert.assertEquals("Password must be between 4 and 20 characters!",registerpage.passwordwarningfield());	

		
		}
	

	




}
