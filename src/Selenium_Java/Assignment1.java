package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("body form-comp form [name=\"name\"]")).sendKeys("amar");
		
		 driver.findElement(By.cssSelector("body form-comp form [name=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("body form-comp form [placeholder=\"Password\"]")).sendKeys("Abcd@1234");
		System.out.println(driver.findElement(By.cssSelector("body form-comp form [type=\"checkbox\"]")).isSelected());
		driver.findElement(By.cssSelector("body form-comp form [type=\"checkbox\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("body form-comp form [type=\"checkbox\"]")).isSelected());
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.cssSelector("body form-comp div [class='form-group'] select option:first-child")).click();
		driver.findElement(By.cssSelector("body form-comp div [class='form-group'] div [value='option1']")).click();
		
		
	}

}
