package UsingTestNg;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClassUtility.BaseClass;
import baseClassUtility.SauseDemoCart;
import baseClassUtility.SauseDemoCheckout;
import baseClassUtility.SauseDemoOverview;
import baseClassUtility.SauseDemoOverviewComplete;
import baseClassUtility.SauseDemoProduct;

public class SauseDemo extends BaseClass {
	
	
	@Test
	public void loginTest()
	{
		System.out.println("Test case 1 Executed");
	}
	
	
	@Test
	public void oderPalcementTest() throws InterruptedException, IOException{
        SauseDemoProduct product = new SauseDemoProduct(driver);
        SauseDemoCart cartPage = new SauseDemoCart(driver);
		SauseDemoCheckout checkoutPage = new SauseDemoCheckout(driver);
		SauseDemoOverview checkoutOverviewPage = new SauseDemoOverview(driver);
		SauseDemoOverviewComplete completePage = new SauseDemoOverviewComplete(driver);
		data();
		
		product.verifyProductPage(productPage1);
		product.clickAddToCart();
		product.verifyCartContains1item(cart1);
		product.clickCartLink();
		Thread.sleep(1000);
		
		cartPage.getVerifyCart(cart1);
		cartPage.getCheckout();
		Thread.sleep(1000);
		checkoutPage.getFirstNamettf(fn);
		checkoutPage.getLastNamettf(ln);
		checkoutPage.getPinCodettf(zipCode);
		checkoutPage.getContinueButton();
		Thread.sleep(1000);
		
		checkoutOverviewPage.getCheckoutOverview(overviewPage);
		checkoutOverviewPage.getFinishButton();
		Thread.sleep(1000);
		completePage.verifyMessage(message);
		
		Thread.sleep(1000);
	}

}
