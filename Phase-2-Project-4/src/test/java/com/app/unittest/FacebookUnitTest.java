package com.app.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.app.annotation.FbTestAnnoation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FacebookUnitTest {


	WebDriver driver;

	@BeforeAll
	public void startbrowser() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	}

	
	@FbTestAnnoation
	public void Testmethod(String username, String password) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

//	@AfterAll
//	public void closebrowser() {
//		driver.close();
//	}
}
