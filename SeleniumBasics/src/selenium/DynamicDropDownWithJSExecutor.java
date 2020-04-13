package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DynamicDropDownWithJSExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		int tableIndex = 3; // This is to indicate the row from where the data has to be extracted.

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement from = driver.findElement(By.id("fromPlaceName"));

		from.sendKeys("beng");

		String destination = "BENGALURU INTERNATION AIRPORT";

		String script = "return document.getElementById(\"fromPlaceName\").value;";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String text= (String) js.executeScript(script);

		while (!text.equalsIgnoreCase(destination)) {
			
			from.sendKeys(Keys.ARROW_DOWN);

			text = (String) js.executeScript(script);

			System.out.println(text);
		}

		from.sendKeys(Keys.ENTER);

		driver.quit();

	}

}
