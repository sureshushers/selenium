package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingCartExample {

	static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(2000);

		String[] cartItems = { "Brocolli", "Pumpkin", "Cucumber", "Tomato" };

		List<String> al = Arrays.asList(cartItems);

		List<WebElement> productName = driver.findElements(By.cssSelector("h4[class='product-name']"));

		int j = 0;

		for (int i = 0; i < productName.size(); i++) {

			String itemName = productName.get(i).getText();

			String[] formattedName = itemName.split("-");

			itemName = formattedName[0].trim();

			if (al.contains(itemName)) {

				j++;

				//*******************REMEMBER***************************************
				driver.findElements(By.cssSelector("div[class='product-action']")).get(i).click();  // REMEMBER: You need to use findElements instead of FindElements to get the get() method

				if (j == cartItems.length)
					break;
			}
		}

		driver.quit();
	}

}
