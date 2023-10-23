package step;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefination {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("I open the browser and enter URL")
	public void i_open_the_browser_and_enter_url() {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@Then("I capture the title of the Page")
	public void i_capture_the_title_of_the_page() throws InterruptedException {
	    Thread.sleep(1000);
	    String title=driver.getTitle();
	    System.out.println("Page title: "+title);
	}

	@Then("I click on Mobile section")
	public void i_click_on_mobile_section() throws InterruptedException {
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(2000);
	}

	@Then("I mouse hover on Mobiles and Accessories")
	public void i_mouse_hover_on_mobiles_and_accessories() throws InterruptedException {
		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobile).build().perform();
		Thread.sleep(3000);
	}


	@Then("I click on apple in filter section")
	public void i_click_on_apple_in_filter_section() throws InterruptedException {
		driver.findElement(By.linkText("Apple")).click(); 
		Thread.sleep(1000);
	}

	@Then("I search product")
	public void i_search_product() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		Thread.sleep(2000);
	}

	@Then("I click on product")
	public void i_click_on_product() {
		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
 
	}

	@Then("I add to wishlist")
	public void i_add_to_wishlist() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
		driver.findElement(By.id("wishlistButtonStack")).click();
	}
}
