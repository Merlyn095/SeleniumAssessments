package baseClassUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseDemoCheckout {
	WebDriver driver;
	
	public SauseDemoCheckout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstNamettf;
	
	@FindBy(id="last-name")
	private WebElement lastNamettf;

	@FindBy(id="postal-code")
	private WebElement PinCodettf;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public void getFirstNamettf(String value) {
		firstNamettf.sendKeys(value);
	}

	public void getLastNamettf(String value) {
		lastNamettf.sendKeys(value);
	}

	public void getPinCodettf(String Value) {
		PinCodettf.sendKeys(Value);
	}

	public void getContinueButton() {
		 continueButton.click();
	}
	
	

}
