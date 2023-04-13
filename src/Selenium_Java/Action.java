package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@role='button'])[12]")));
		
		a.moveToElement(driver.findElement(By.xpath("(//a[@role='button'])[12]"))).build().perform();

	}

}
