package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.searchResultsPage;
import factory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver;
	HomePage homepage;
	searchResultsPage searchresultpage;

	@Given("User has open the application")
	public void user_has_open_the_application() {
		driver = driverFactory.getDriver();

	}

	@When("User has enter the valid product {string} in to search field")
	public void user_has_enter_the_valid_product_in_to_search_field(String validProduct) {
		HomePage homepage = new HomePage(driver);
		homepage.enterproductseaecBox(validProduct);
	}

	@When("User has clicks on search button")
	public void user_has_clicks_on_search_button() {
		homepage.clickonserchbox();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		 searchresultpage=new searchResultsPage(driver);
		
		Assert.assertTrue(searchresultpage.displayvalidproduct());

	}

	@When("User has enter the invalid product {string} in to search box field")
	public void user_has_enter_the_invalid_product_in_to_search_box_field(String invalidProduct) {
		 homepage=new HomePage(driver);
		homepage.enterproductseaecBox(invalidProduct);
		

	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
		
		Assert.assertEquals("There is no product that matches the search criteria.",searchresultpage.getMesageTex());
				

	}

	@When("User has dont enter any product name into search box field")
	public void user_has_dont_enter_any_product_name_into_search_box_field() {

		HomePage homepage=new HomePage(driver);

	}

}
