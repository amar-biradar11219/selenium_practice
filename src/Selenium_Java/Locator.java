package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver","C://driver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.className("oxd-input")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(5) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector(null));
		
//		driver.get("https://rahulshettyacademy.com/locatorspractice");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.id("inputUsername")).sendKeys("Admin");
//		driver.findElement(By.name("inputPassword")).sendKeys("password");
		
		
	}

}
