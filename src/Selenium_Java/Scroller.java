package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=50");
		
		List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for (int i=0;i<values.size();i++) {
			 System.out.println(Integer.parseInt(values.get(i).getText()));
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		String text = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		
		int text1 = Integer.parseInt(text);
		
		Assert.assertEquals(sum, text1);
		
		
	}

}
