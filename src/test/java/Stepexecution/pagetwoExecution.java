package Stepexecution;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.PageTwoPageFactory;

public class pagetwoExecution extends PageTwoPageFactory {

	
	@Given("get the text of the departure time")
	public void get_the_text_of_the_departure_time() throws InterruptedException {
		PageTwoPageFactory pg = new PageTwoPageFactory();
		Thread.sleep(1000);
		String toTime = pg.toTime.getText();
		System.out.println(toTime);
		
	}

	@When("select the departure ticket price")
	public void select_the_departure_ticket_price() throws InterruptedException  {
		PageTwoPageFactory pg = new PageTwoPageFactory();
		Thread.sleep(1000);
		String toPrice = pg.price.getText();
		System.out.println(toPrice);
		click(pg.price);
	}

	@Then("get the text of the returning time")
	public void get_the_text_of_the_returning_time() throws InterruptedException {
		PageTwoPageFactory pg = new PageTwoPageFactory();
		Thread.sleep(1000);
		String returnTime = pg.returnTime.getText();
		System.out.println(returnTime);
	}

	@Then("select the return ticket price")
	public void select_the_return_ticket_price()throws InterruptedException  {
		PageTwoPageFactory pg = new PageTwoPageFactory();
		Thread.sleep(1000);
		String returnPrice = pg.returnedprice.getText();
		System.out.println(returnPrice);
		click(pg.returnedprice);
	}
	
	
}
