package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_open {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			System.setProperty("WebDriver.chrome.driver","C://driver/chromedriver.exe");
			driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
					
			
			
		

	}


}
