package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTablesSteps {

	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
		
		// below code to read a single set of data from data table
		//	List<String> BillData = dataTable.asList(String.class);

		//below code to read multiple data from data table		
		//	List<List<String>> BillData = dataTable.asLists(String.class);
		
		//below code read the data a map format from the data table.
		List<Map<String,String>> BillData = dataTable.asMaps(String.class, String.class);

//		for (List<String> BillItems: BillData) {
//			for (String BillItem: BillItems) {
//				System.out.println(BillItem);
//				
//			}
//		}
		
		//below nested loop to read the contains of data table
		for (Map<String, String> BillItems: BillData) {
			for (Map.Entry<String, String> BillItem: BillItems.entrySet()) {
				System.out.println("Key:" + BillItem.getKey());
				System.out.println("Value:" + BillItem.getValue());
			}
		}
	}

	@When("I generated the bill")
	public void i_generated_the_bill() {
		
	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {
	    
	}

}
