package baseClassUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseDemoCart {
	WebDriver driver;
	
	public SauseDemoCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement verifyCart;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;

	public void getVerifyCart(String value) {
		if(verifyCart.getText().equals(value)) {
			System.out.println(value+" product is displayed");
			
		}
		else {
			System.out.println(value+" product is not  displayed");
			
		}
	}

	public void getCheckout() {
		checkoutButton.click();
		System.out.println("After Checkout click:");
	    System.out.println("URL = " + driver.getCurrentUrl());
	    System.out.println("Title = " + driver.getTitle());
	}

}
