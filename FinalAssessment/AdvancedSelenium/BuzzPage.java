package FinalAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BuzzPage {
	WebDriver driver;
	
	public BuzzPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//textarea[@class='oxd-buzz-post-input']")
	private WebElement textField;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--main\"]")
	private WebElement postButton;
	
	@FindBy(xpath="//i[@class=\"oxd-icon bi-clock-history oxd-button-icon\"]")
	private WebElement mostRecent;
	
	@FindBy(xpath="//div[contains(@class,'orangehrm-buzz-post-body')]/descendant::p")
	private WebElement verify;

	public void getTextField(String value) {
	    textField.sendKeys(value);
	}

	public void getPostButton() {
		postButton.click();
	}

	public void getMostRecent() {
		mostRecent.click();
	}

	public void getVerify() {
		String text = verify.getText();
		Assert.assertTrue(text.contains(text));
		System.out.println("Most recent page is visible");
		
		
	}
	
	
	
	

}
