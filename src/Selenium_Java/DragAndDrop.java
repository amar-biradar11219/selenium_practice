package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions A = new Actions(driver);
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement source =driver.findElement(By.id("column-a"));
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id=\"column-a\"] header")).getText(),"A");
		WebElement target = driver.findElement(By.id("column-b"));
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id=\"column-b\"] header")).getText(),"B");
		A.dragAndDrop(source, target).build().perform();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id=\"column-a\"] header")).getText(),"B");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id=\"column-b\"] header")).getText(),"B");
		
	}

}
