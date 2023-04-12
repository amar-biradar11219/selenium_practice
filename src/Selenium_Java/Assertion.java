package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		
		Assert.assertEquals(driver.getTitle(),"Practice Page");
		
		

	}

}
