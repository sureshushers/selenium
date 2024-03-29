package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		int tableIndex = 3; // This is to indicate the row from where the data has to be extracted.

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rowCount = driver.findElements(By.xpath("//table[@id ='product']//tr")).size();
		
		int colCount = driver.findElements(By.xpath("//table[@id ='product']//th")).size();
		
		System.out.println("The rowcount is "+rowCount);
		
		System.out.println("The column count is "+colCount);
		
		List<WebElement> nthIndexRow = driver.findElements(By.cssSelector("tr:nth-child("+tableIndex+") td"));
		
		for(WebElement e:nthIndexRow) {
			
			System.out.println(e.getText());
			
		}
		

	}

}
