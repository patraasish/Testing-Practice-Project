package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAndXpathLocatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open the url 
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		//Syntax: //selector_name[@attribute_name='value']
				driver.findElement(By.xpath("//input[@name='wpPassword']")).sendKeys("xpath");
				
				//cssSelector locator demo
				//syntax: css=tag#id
				//id="wpRetype"
				driver.findElement(By.cssSelector("input#wpRetype")).sendKeys("xpath");

	}

}
