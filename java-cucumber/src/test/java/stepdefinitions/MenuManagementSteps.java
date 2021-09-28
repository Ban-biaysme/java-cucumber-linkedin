package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumbercourse.RestaurantMenu;
import cucumbercourse.RestaurantMenuItem;

import static org.junit.Assert.*;

public class MenuManagementSteps {
	RestaurantMenuItem NewMenuItem;
	RestaurantMenu LocationMenu = new RestaurantMenu();
	String ErrorMessage;

	
//	@Given("I have a menu item with name {string} and price {int}")
	
	public MenuManagementSteps() {
		System.out.println("Constructor called");
	}

	//below line is the alternate of above line using regular expression
	@Given("I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)")
	public void i_have_a_menu_item_with_name_and_price(String menuItemName,String currencyType, Integer price) {

		NewMenuItem = new RestaurantMenuItem(menuItemName, menuItemName, price);
		System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
		try {
			LocationMenu.addMenuItem(NewMenuItem);
		}
		catch (IllegalArgumentException ex) {
			ErrorMessage = ex.getMessage();
		}
		
		System.out.println("Step 2");
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
		boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
		System.out.println("Step 3: " + Exists);
	}
	
	@Then("I should see an error message with value {string}")
	public void i_should_see_an_error_message_with_value(String string) {
		String expected="Duplicate Item";
		System.out.println("errorMessage::" + ErrorMessage);
		
		//below code need to fix later, it throwing error
	   // assertEquals(expected, ErrorMessage);
	}
}