package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclasscheapair.Baseclasscheap;

public class PageTwoPageFactory extends Baseclasscheap{

	public PageTwoPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='sc-iaFMSK iVWAkA'])[1]")
	public WebElement price;
	
	@FindBy(xpath="(//span[@class='sc-iaFMSK iVWAkA'])[4]")
	public WebElement returnedprice;
	
	
	@FindBy(xpath="(//span[@class='sc-cNYriL iMFOwb'])[1]")
	public WebElement toTime;
	
	
	@FindBy(xpath="//div[@class='FlightSegment_Full__DepartureArrivalStyled-sc-18y1gd-2 dKrdUF'])[1]")
	public WebElement returnTime;
	
	
}
