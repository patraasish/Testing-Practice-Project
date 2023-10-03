package in.amazon.project.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSignInPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);

		// locating the dropdown that has sign in button -> signin - accounts and lists
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("ap_email")).sendKeys("asish@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();

		// fetch the error text
		String text = driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/descendant::span"))
				.getText();

		System.out.println("Error test is >> " + text);

		driver.close();

	}

}
