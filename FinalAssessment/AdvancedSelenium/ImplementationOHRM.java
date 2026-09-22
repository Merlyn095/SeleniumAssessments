package FinalAssessment;

import org.testng.annotations.Test;

import Day12.OrangeLogoutPage;

public class ImplementationOHRM extends BaseClassOHRM {
	
	@Test(dataProvider = "buzzField")
	public void test(String testField) throws InterruptedException {
		
		HomePage home=new HomePage(driver);
		home.getBuzzButton();
		
		BuzzPage buzz=new BuzzPage(driver);
		buzz.getTextField(testField);
		Thread.sleep(1000);
		buzz.getPostButton();
		buzz.getMostRecent();
		buzz.getVerify();
		Thread.sleep(1000);
		
		OrangeLogoutPage logout=new OrangeLogoutPage(driver);
		logout.logout();
		
		
		
	}
	

}
