package baseClassUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseDemoLogin {
	
	WebDriver driver;
	
	public SauseDemoLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;

	public void getUsername(String value) {
		  username.sendKeys(value);
	}

	public void getPassword(String value) {
		password.sendKeys(value);
	}

	public void getLoginButton() {
		loginButton.click();
	}
	
	
	

}
