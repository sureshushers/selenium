package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		explicitWaitExample(driver);
		
		driver.quit();

	}
	
	
	
	public static void explicitWaitExample(WebDriver driver) {
		
		
		WebDriverWait wait = new WebDriverWait(driver,4);
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		
	}

}

