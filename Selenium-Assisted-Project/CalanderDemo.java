package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// whenever we have to get text of an element- getText()
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyear);
		
		String my[] = monthyear.split(" ");

		String month = my[0]; // September
		String year = my[1]; // 2023
		
		while(!(month.equals("June") && year.equals("2024"))) {
			// click on the next button of the calander
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			month = monthyear.split(" ")[0]; // August
			year = monthyear.split(" ")[1]; // 2024
					
		}
		
		// Select the data as 14 and click on it
		driver.findElement(By.xpath("//a[text()='14']")).click();
		
	}

}
