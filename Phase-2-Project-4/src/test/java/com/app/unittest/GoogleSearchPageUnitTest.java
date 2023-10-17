package com.app.unittest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.app.annotation.GoogleSearchPageTestAnnoation;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleSearchPageUnitTest {

	WebDriver driver;

	@BeforeAll
	public void startbrowser() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
	}

	@GoogleSearchPageTestAnnoation
	public void GSTestMethod(String value) throws InterruptedException {
		driver.findElement(By.id("APjFqb")).sendKeys(value);
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@AfterAll
	public void closebrowser() {
		driver.close();
	}
}
