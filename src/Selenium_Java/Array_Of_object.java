package Selenium_Java;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array_Of_object {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j =0;
		String[] itemNeeded = { "Brocolli", "Cauliflower" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(2000);


		List<WebElement> products = driver.findElements(By.xpath("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List<String> itemneededlist = Arrays.asList(itemNeeded);

			if (itemneededlist.contains(formatedName)) {
				
				j++;
				
				driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button")).click();
				
				if(j==3) {
				
					break;
				}
				
				
			}
			
			
		}

	}
}
