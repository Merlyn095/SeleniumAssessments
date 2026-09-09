package assessmentDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		WebElement loc = driver.findElement(By.xpath("//span[text()='Create new account']"));
		System.out.println(loc.getLocation());
		WebElement text = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		System.out.println(text.getDomAttribute("value"));
		System.out.println(text.getDomProperty("value"));
		text.sendKeys("nmerlynsahana@gmail.com");
		System.out.println(text.getDomAttribute("value"));
		System.out.println(text.getDomProperty("value"));
        loc.click();
		WebElement loc1 = driver.findElement(By.xpath("//span[text()='Submit']"));
		System.out.println(loc1.getSize());
		System.out.println(loc1.getCssValue("font-family"));
		System.out.println(loc1.getCssValue("background-color"));
		System.out.println(loc1.getCssValue("align-items"));
		driver.quit();
		
		
	}

}
