package Selenium_Java;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Actions Action = new Actions(driver);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		String name = driver.findElement(By.cssSelector("div p[class='im-para red']")).getText();
		System.out.println(name);
		String emailID = name.split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.cssSelector("div input[type='text']")).sendKeys(emailID);

	}

}
