package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_properties {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("WebDriver.chrome.driver","C://driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		driver.navigate().back();
	}

}
