package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsDemo {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open the url 
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		//1. id locater demo
		//check if the textbox is present or not
		boolean displayed= driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("The input box is displayed: "+displayed);
		
		//check if the text box is present or not 
		boolean enabled=driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("The input box is enabled: "+enabled);
		
		//check if the text box is take input or not
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		
		//2. name locator demo
		displayed =driver.findElement(By.name("wpPassword")).isDisplayed();
		System.out.println("The password is displayed: "+displayed);
		enabled=driver.findElement(By.name("wpPassword")).isEnabled();
		System.out.println("The password is enabled: "+enabled);
		driver.findElement(By.name("wpPassword")).sendKeys("admin123");
		
		//3. linktext locator demo
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).sendKeys("admin123");
		driver.findElement(By.id("wpRemember")).click();
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		
		//4.partialLinkText locator demo
		driver.findElement(By.partialLinkText("account")).click();
		
		//5.className locator demo
		//driver.findElement(By.className("mw-login-flush-right")).click();
		
		//6.xpath locator demo
		//Syntax: //selector_name[@attribute_name='value']
		driver.findElement(By.xpath("//input[@name='wpPassword']")).sendKeys("xpath");
		
		//7.cssSelector locator demo
		//syntax: css=tag#id
		//id="wpRetype"
		driver.findElement(By.cssSelector("input#wpRetype")).sendKeys("xpath");
		
		//8. tagName locator demo
		driver.findElement(By.tagName("input")).sendKeys("a@gmail.com");
		
	
	}

}
