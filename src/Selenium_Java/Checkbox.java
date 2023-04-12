package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		
		
		
		
		
		
	}

}
