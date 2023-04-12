package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		driver.findElement(By.xpath("//div[@id=\"entry_217822\"]//input[@placeholder=\"Search For Products\"]")).sendKeys("Canon");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//ul[@class='dropdown-menu autocomplete w-100'])[1]")).click();
		try 
		{
			List<WebElement> options = driver.findElements(By.xpath("(//li[@class='product-thumb px-3 py-2 m-0 image-left'])"));
			
			for(WebElement option :options) 
			{
				
				if(option.getText().equalsIgnoreCase("Canon EOS 5D")) 
				{
					option.click();
					break;
				}
			}
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			List<WebElement> options = driver.findElements(By.xpath("(//li[@class='product-thumb px-3 py-2 m-0 image-left'])"));
			
			for(WebElement option :options)
			{
				
				if(option.getText().equalsIgnoreCase("Canon EOS 5D")) 
				{
					option.click();
					break;
				}
				driver.quit();
			}
			
		}
	}

}
