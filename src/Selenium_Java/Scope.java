package Selenium_Java;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int LinkCount = driver.findElements(By.tagName("a")).size();
		System.out.println(LinkCount);
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int Linkcountfooter = footer.findElements(By.tagName("a")).size();
		System.out.println(Linkcountfooter);
		
		WebElement footerLink = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul [1]"));
		
			System.out.println(footerLink.findElements(By.tagName("a")).size());
//		System.out.println(linkcountFooterlink);
		
		//click on the  link
		
		for(int i=0;i<footerLink.findElements(By.tagName("a")).size();i++) {
			
			 String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 
			 footerLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		}
			
		
		
		
	}

}
