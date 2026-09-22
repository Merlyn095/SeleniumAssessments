package FinalAssessmen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppQspiders1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		WebElement slider = driver.findElement(By.xpath("//input[@id='slide']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(200, 0).release().perform();
        String text = driver.findElement(By.xpath("//h3[text()='Mens Cotton Jacket']")).getText();
        if(text.contains("Mens Cotton Jacket")) {
        	System.out.println(" Mens Cotton Jacket indentified");
        }
        else {
        	System.out.println(" Mens Cotton Jacket not indentified");
        	
        }
		
		driver.quit();
		
		
		
	}

}
