package Stepexecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.Homepagefactory;

public class homepage extends Homepagefactory {


	@Given("select from and to")
	public void select_from_and_to() throws InterruptedException, AWTException, IOException {
		browserLaunch("chrome");
		loadUrl("https://www.cheapair.com/");
		Homepagefactory hp = new Homepagefactory();
		waits(20);
		//click(clear);
       // click(fromclass);
		waits(20);
 hp.fromclass.sendKeys("Madras, India");
        Robot r =new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);	
		r.keyRelease(KeyEvent.VK_ENTER);	
		hp.toPlace.sendKeys("Delhi, India");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
}

	@Given("Select Dates")
	public void select_Dates() {
		Homepagefactory hp = new Homepagefactory();
		int size=hp.departs.size();
		for(int i=0;i<=size;i++)
		{
			String date1=hp.departs.get(i).getText();
			if(date1.equals("24")) {
				hp.departs.get(i).click();
				break;
			}
		}
		int size1=hp.return1.size();
		System.out.println("size of return calender = "+size1);
		for(int i=0;i<=size1;i++)
		{
			String date12=hp.return1.get(i).getText();
			if(date12.equals("27")) {
				hp.return1.get(i).click();
				break;
			}
		}
		waits(20);
	}

	@When("choose economy")
	public void choose_economy() {
		Homepagefactory hp = new Homepagefactory();
		for(int i=0;i<2;i++)
		 {
			waits(20);
			 click(hp.plus);
		 }
		for(int i=0;i<2;i++)
		 {
			waits(20);
			 click(hp.plusSenior);
		 }
		
		for(int i=0;i<2;i++)
		 {
			waits(20);
			 click(hp.pluschildren);
		 }
		
		for(int i=0;i<2;i++)
		 {
			waits(20);
			 click(hp.plusinfant);
		 }
		
	}

	@Then("choose traveller")
	public void choose_traveller() {
		Homepagefactory hp = new Homepagefactory();
		click(hp.search);
		 Set<String> allwindow = driver.getWindowHandles();
		 List<String> l=new ArrayList<>(allwindow);
		 driver.switchTo().window(l.get(1));
		 waits(10);
		click(hp.popup);
		
	}
	
	
}
