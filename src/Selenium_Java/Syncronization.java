package Selenium_Java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("a img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()=\"PROCEED TO CHECKOUT\"]")).click();
		
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class='promoBtn']")).sendKeys("rahulshettyacademy"));
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[class=\"promoCode\"]")));
		
		driver.findElement(By.cssSelector("input[class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();	
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
