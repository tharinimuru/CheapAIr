package pagefactory;

import org.openqa.selenium.support.PageFactory;

import Baseclasscheapair.Baseclasscheap;

public class RegisterpageFactory extends Baseclasscheap {

	public RegisterpageFactory() {
		PageFactory.initElements(driver, this);
	}
}
