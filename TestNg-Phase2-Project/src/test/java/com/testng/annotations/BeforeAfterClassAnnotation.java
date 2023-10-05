package com.testng.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassAnnotation {

	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test(priority=2)
	public void login() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
	}
	
	@Test(priority=1)
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	@Test(priority=3)
	public void logout() throws InterruptedException {
		
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Logout")).click();

		Thread.sleep(1500);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
}
