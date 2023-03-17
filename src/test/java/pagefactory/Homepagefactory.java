package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclasscheapair.Baseclasscheap;

public class Homepagefactory extends Baseclasscheap{

	public Homepagefactory() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='from1']")
	public WebElement fromPlace;
	
	@FindBy (xpath ="(//input[@class='form-control prominent ui-autocomplete-input'])[1]")
	public WebElement fromclass;
	
	
	
	@FindBy (xpath ="//span[@id='from1Clear']")
	public WebElement clear;
	
	@FindBy(xpath="//span[text()='Airport']")
	public WebElement place;
	
	@FindBy(xpath="//div[@id='datePickerContainer']//table[1]//td")
	public List<WebElement> departs;

	@FindBy(xpath="(//div[@id='datePickerContainer']//table)[2]//td")
	public List<WebElement> return1;
	
	@FindBy(id="to1")
	public WebElement toPlace;
	
	
	
	@FindBy(xpath="//div[@class='sc-fnGiBr bJsruJ']")
	public WebElement contiunes;
	
	
	@FindBy(xpath="(//a[text()='28'])[1]")
	public WebElement fromdate;
	
	@FindBy(xpath="(//a[text()='17'])[1]")
	public WebElement todate;
	
	@FindBy(xpath ="(//button[@type='button'])[2]")
	public WebElement plus;
	
	@FindBy(xpath ="(//button[@type='button'])[4]")
	public WebElement plusSenior;
	
	@FindBy(xpath ="(//button[@type='button'])[6]")
	public WebElement pluschildren;
	
	@FindBy(xpath ="(//button[@type='button'])[8]")
	public WebElement plusinfant;
	
	@FindBy(xpath="//div[@class='form-control readonly prominent']")
	public WebElement travelereco;
	
	@FindBy(xpath="//button[text()='Search Flights']")
	public WebElement search;

	
 @FindBy(xpath="//div[@class='sc-fnGiBr kCVmbb']")
			public WebElement popup;
 
 //details
 @FindBy(id="firstName1")
	public WebElement firstnameP1;
 
 @FindBy(id="lastName1")
	public WebElement lastnameP1;
 
 @FindBy(id="firstName2")
	public WebElement firstName2;
 
 
 @FindBy(id="lastName2")
	public WebElement lastName2;
 
 @FindBy(id="lastName3")
	public WebElement lastName3;
 
 @FindBy(id="firstName4")
	public WebElement firstName4;
 
 @FindBy(id="firstName5")
	public WebElement firstName5;
 
 @FindBy(id="firstName6")
	public WebElement firstName6;
 @FindBy(id="firstName7")
	public WebElement firstName7;
 @FindBy(id="firstName8")
	public WebElement firstName8;
 @FindBy(id="firstName9")
	public WebElement firstName9;
 
 
 @FindBy(id="lastName4")
	public WebElement lastName4;
 @FindBy(id="lastName5")
	public WebElement lastName5;
 @FindBy(id="lastName6")
	public WebElement lastName6;
 
 @FindBy(id="lastName7")
	public WebElement lastName7;
 
 @FindBy(id="lastName8")
	public WebElement lastName8;
 @FindBy(id="lastName9")
	public WebElement lastName9;
 
}

