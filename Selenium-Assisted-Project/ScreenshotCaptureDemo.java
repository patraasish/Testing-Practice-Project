package seleniumpratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCaptureDemo {

			public static void main(String[] args) throws InterruptedException, IOException {
				
				
				 WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://opera.com/download");
					
					Thread.sleep(1000);
					
					// take screenshot of current window and store it in a file object
					
					File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					// Create a file at the destination and store the screenshot there.
					// here . is the current project folder create a folder called Screenshots and save screenshot with file
					// name as opera.png
					// if you are in a simple java project: then download the jar file for
					// apache.commons.io from : https://repo1.maven.org/maven2/commons-io/commons-io/2.11.0/
					// in the above url, you will a jar file with name as: commons-io-2.11.0.jar   
					// click on it and download
					
					//Suppose you have a maven project then add these dependency in the POM file
					/*
					 <dependency>
		    			<groupId>commons-io</groupId>
		    			<artifactId>commons-io</artifactId>
		    			<version>2.11.0</version>
					</dependency>
					 */
					
					File destFile = new File("./Screenshots/opera.png");

					FileUtils.copyFile(srcFile, destFile);
					
					
					
					
					
			}

		}

