package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Security {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(op);
		
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
