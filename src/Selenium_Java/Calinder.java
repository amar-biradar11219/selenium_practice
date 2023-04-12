package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Calinder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(o);

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();

		System.out.println(driver.findElement(By.cssSelector(
				"div[class=\"css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\"]"))
				.getAttribute("style"));
		if (driver.findElement(By.cssSelector(
				"div[class=\"css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\"]"))
				.getAttribute("style").contains(
						"background-color: rgb(238, 238, 238); border-bottom-left-radius: 0px; border-top-left-radius: 0px;")) {

			System.out.println("disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("enable");

		}

		driver.findElement(By.cssSelector(
				"div[class=\"css-1dbjc4n r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\"]"))
				.click();

		driver.findElement(By.cssSelector(
				"body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)"))
				.click();

		Thread.sleep(4000);

		System.out.println(driver.findElement(By.cssSelector(
				"div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-pm2fo r-11u4nky r-z2wwpe r-1phboty r-ou6ah9 r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']"))
				.getAttribute("style"));

		if (driver.findElement(By.cssSelector(
				"div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-pm2fo r-11u4nky r-z2wwpe r-1phboty r-ou6ah9 r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']"))
				.getAttribute("style").contains("")) {
			System.out.println("enable");
			Assert.assertTrue(true);
		}

//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().dismiss();

	}

}
