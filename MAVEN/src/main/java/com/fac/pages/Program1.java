package com.fac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Program1 {
	@Test
	public void m1() {
		System.setProperty("webdriver.gecko.driver", "D:\\yash\\Selenium\\Browser Servers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_l")).sendKeys("Honey");
		driver.findElement(By.id("u_0_n")).sendKeys("Reddy");
		driver.findElement(By.id("u_0_q")).sendKeys("9108169315");
		driver.findElement(By.id("u_0_x")).sendKeys("udaytej91");
		// WebElement date = driver.findElement(By.id("day"));
		/*
		 * Select SelectDate = new Select(date); SelectDate.selectByVisibleText("4");
		 * 
		 * WebElement mnth = driver.findElement(By.id("month")); Select SelectMonth =
		 * new Select(mnth); SelectMonth.selectByValue("12");
		 * 
		 * 
		 * WebElement yr = driver.findElement(By.id("year")); Select SelectYear = new
		 * Select(yr); SelectYear.selectByVisibleText("1991");
		 * 
		 * driver.findElement(By.id("u_0_b")).click();
		 * driver.findElement(By.id("u_0_13")).click();
		 * 
		 */
	}
}