package baseClassUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass extends CommonData {
	public WebDriver driver=null;
	@BeforeSuite
	public void bS() {
		Reporter.log("Open Database Connectivity",true);
	}
	@BeforeTest
	public void bT() {
		Reporter.log("pre-condition", true);
	}
	
	@BeforeClass
	public void bC() throws IOException {
		data();
	
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");


            // Disable Chrome password warning
            HashMap<String, Object> prefs =
                    new HashMap<>();

            prefs.put(
                    "credentials_enable_service",
                    false
            );

            prefs.put(
                    "profile.password_manager_leak_detection",
                    false
            );
            options.setExperimentalOption("prefs",prefs);
			driver=new ChromeDriver(options);
		}
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void bM() throws IOException {
	     SauseDemoLogin login=new SauseDemoLogin(driver);
	     driver.get(url);
	     login.getUsername(username);
	     login.getPassword(password);
	     login.getLoginButton();
	     Reporter.log("Login Done",true);
		
		
		
	}
	
	@AfterMethod
	public void aM() {
		Reporter.log("Logout done", true);
	}
	
	@AfterClass
	public void aC() {
		driver.quit();
		Reporter.log("Close Browser", true);
	}
	
	@AfterTest
	public void aT() {
		Reporter.log("post-condition", true);
	}
	
	
	@AfterSuite
	public void aS() {
		Reporter.log("Close - DataBase Connectivity", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
