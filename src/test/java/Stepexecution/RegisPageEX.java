package Stepexecution;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.RegisterpageFactory;

public class RegisPageEX extends RegisterpageFactory {
	
	@When("Enter the details for registration")
	public void enter_the_details_for_registration(io.cucumber.datatable.DataTable dataTable) {
		for (int i = 1; i <= 8; i++) {
			
			findElementByID("firstName" + i).sendKeys(dataTable.cell(1, i));
			findElementByID("middleName"+i).sendKeys(dataTable.cell(2, i));
			findElementByID("lastName"+i).sendKeys(dataTable.cell(3, i));
			selectByValue(findElementByID("suffix"+i),dataTable.cell(4, i));
			selectByValue(findElementByID("gender"+i),dataTable.cell(5, i));
			selectByText(findElementByID("gender"+i),dataTable.cell(5, i));
			findElementByID("dobDay"+i).sendKeys(dataTable.cell(7, i));
			findElementByID("dobYear"+i).sendKeys(dataTable.cell(8, i));
			
			
		}
	}

	@Then("Enter the card details")
	public void enter_the_card_details(io.cucumber.datatable.DataTable dataTable) {
		findElementByID("ccNum1").sendKeys(dataTable.cell(1, 1));
		selectByValue(findElementByID("expMonth1"),dataTable.cell(2,1));
		selectByText(findElementByID("expYear1"),dataTable.cell(3,1));
		findElementByID("cvv1").sendKeys(dataTable.cell(4,1));
		findElementByID("paymentName1").sendKeys(dataTable.cell(5,1));
		selectByText(findElementByID("paymentCountry1"),dataTable.cell(6,1));
		findElementByID("paymentAddress1").sendKeys(dataTable.cell(7,1));
		findElementByID("paymentAddress21").sendKeys(dataTable.cell(8,1));
		findElementByID("paymanetCity1").sendKeys(dataTable.cell(9,1));
		findElementByID("paymentPhone1").sendKeys(dataTable.cell(11,1));
		findElementByID("email").sendKeys(dataTable.cell(12,1));
		findElementByID("password").sendKeys(dataTable.cell(13,1));
		findElementByID("confirmPassword").sendKeys(dataTable.cell(14,1));
	}

}
