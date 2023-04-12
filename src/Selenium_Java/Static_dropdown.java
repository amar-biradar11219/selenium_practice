package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
//				Thread.sleep(2000);
//				driver.findElements(By.xpath("(//a[@role='button'])[12]"));
		driver.findElement(By.cssSelector("div[id='entry_217822'] input[placeholder='Search For Products']"))
				.sendKeys("canon");
		Thread.sleep(2000);
//				List<WebElement> options = driver.findElements(By.xpath("(//a[contains(text(),'Canon EOS 5D')])[1]"));

		List<WebElement> options = driver.findElements(By.cssSelector("#search > div.search-input-group.flex-fill > div.dropdown"));
		for (WebElement option : options)
		{
			if (option.getText().equals("Canon EOS 5D"))
			{
				option.click();
				break;
			}
		} 
	}

}
