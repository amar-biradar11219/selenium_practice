package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver","C://driver/chromedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getText();
		System.out.println(name);
//		Assert.assertEquals(driver.findElements(By.cssSelector("body header[class='jumbotron text-center header_style'] div button:nth-child(1)")).getText(),
		Assert.assertEquals(driver.findElement(By.xpath("//button[2] ")).getText(), "Login");
	}

}
