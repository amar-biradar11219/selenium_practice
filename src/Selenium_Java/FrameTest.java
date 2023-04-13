package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
////		driver.switchTo().frame(driver.findElement(By.cssSelector("div fieldset iframe")));
//		int framesize = driver.findElements(By.tagName("iframe")).size();
//		
//		System.out.println(framesize);
//		
//		driver.switchTo().frame(0);
////		driver.switchTo().frame(driver.findElement(By.cssSelector("div fieldset iframe")));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@class=\"block large-row-spacer\"]/fieldset[1]")));
//		driver.findElement(By.xpath("//body/div[@class=\"block large-row-spacer\"]/fieldset[1]")).click();
		
		
//		multiple framework
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		int framesize = driver.findElements(By.tagName("frame")).size();
		System.out.println(framesize);
		driver.switchTo().frame(0);
		int insideframesize = driver.findElements(By.tagName("frame")).size();	
		System.out.println(insideframesize);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("body div[id='content']")).getText());
	
	}

}
