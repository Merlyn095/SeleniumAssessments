package baseClassUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseDemoProduct {
	WebDriver driver;
	
	public SauseDemoProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@aria-label='Cart, 1 items']")
	private WebElement cart;
	
	public void clickAddToCart()
	{
		addToCart.click();
	}
	
	public boolean verifyProductPage(String value)
	{
		
		if(driver.getCurrentUrl().contains(value))
			return true;
		else
			return false;
	}
	
	public void verifyCartContains1item(String value)
	{
		if(cart.getText().equals(value))
			System.out.println("cart contains 1 item");
		else
			System.out.println("cart doesn't contains 1 item");
	}
	
	public void clickCartLink()
	{
		cart.click();
	}

}
