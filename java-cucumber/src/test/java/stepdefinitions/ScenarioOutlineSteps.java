package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumbercourse.BillCalculationHelper;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioOutlineSteps {

	int InitialBillAmount;
	double TaxRate;
	
	@Given("I have a Customer")
	public void i_have_a_Customer() {

	}

	@Given("user enters initial bill amount as {int}")
	public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
		this.InitialBillAmount= initialBillAmount;
		System.out.println("InitialBillAmount " + initialBillAmount);
		
	}

	@Given("Sales Tax Rate is {int} Percent")
	public void sales_Tax_Rate_is_Percent(Integer taxRate) {
	    this.TaxRate = taxRate;
	    System.out.println("TaxRate : "+ taxRate);
	}

	@Then("final bill amount calculate is {int}")
	public void final_bill_amount_calculate_is(Integer expectedValue) {
		  double systemCalcValue=
				   BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
		
		System.out.println("Expected value : " + expectedValue);
		System.out.println("System Calculated Value : " + systemCalcValue);
		
			assertTrue(expectedValue == systemCalcValue);
	}

	@Given("Sales Tax Rate is {double} Percent")
	public void sales_Tax_Rate_is_Percent(Double taxRate) {
		this.TaxRate = taxRate;
	    System.out.println("TaxRate : "+ taxRate);
	}
	
	private void invokeWebPage(Double expectedValue) {
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8080/BasicWebsite/Index.jsp");
		
		WebElement BillAmountTextBox = driver.findElement(By.id("billamount"));
		
		WebElement TaxRateTextBox = driver.findElement(By.id("taxrate"));
		
		WebElement Button = driver.findElement(By.id("mybutton"));
		
		BillAmountTextBox.sendKeys(Integer.toString(InitialBillAmount));
		
		TaxRateTextBox.sendKeys(Double.toString(TaxRate));
		
		Button.click();
		
		WebElement Header1Element = driver.findElement(By.xpath("//h1"));
		
		System.out.println(Header1Element.getText());
		
		boolean Matched = Header1Element.getText().contains("Final Bill Amount is: $" + expectedValue.toString());
		
		System.out.println(Matched);
		
	}

	@Then("final bill amount calculate is {double}")
	public void final_bill_amount_calculate_is(Double expectedValue) {
	   double systemCalcValue=
			   BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
	
	System.out.println("Expected value : " + expectedValue);
	System.out.println("System Calculated Value : " + systemCalcValue);
	
		assertTrue(expectedValue == systemCalcValue);
		invokeWebPage(expectedValue);
	}
}
