package in.amazon.project.lesson1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMobilePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Thread.sleep(1500);

		driver.findElement(By.linkText("Mobiles")).click();

		// Move the mouse to the element

		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));

		Actions a = new Actions(driver);

		a.moveToElement(mobile).build().perform();

		Thread.sleep(3000);

		// click on the mobile brand Apple

		driver.findElement(By.linkText("Apple")).click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");

		driver.findElement(By.id("twotabsearchtextbox")).submit();

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));

		Thread.sleep(1500);

		driver.findElement(By.id("wishlistButtonStack")).click();

	}

}
