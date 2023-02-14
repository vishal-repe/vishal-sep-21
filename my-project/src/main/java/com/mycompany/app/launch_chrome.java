package com.mycompany.app;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launch_chrome {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://www.facebook.com");
	       
	       //implicit wait
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
		   driver.manage().window().maximize();
		   
		   WebElement username = driver.findElement(By.xpath("//*[@name='login']//preceding::input[4]"));
		   
		   WebElement Password = driver.findElement(By.xpath("//*[@name='login']//preceding::input[3]"));
		   
		   WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log In']"));
		   
		  WebElement CreatenewAcc = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[3]"));
		  
		  List<WebElement> image = driver.findElements(By.tagName("img"));
		   
		  List<WebElement> FacebookLinks = driver.findElements(By.xpath("//a[contains(text(),'Facebook')]"));
		  
		  WebElement ForgotPassword =  driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[1]//a"));
		  
		  username.sendKeys("repevishal@gmail.com");
		  
		  Password.sendKeys("1234874652");
		  
		 // driver.navigate().to("https://kite.zerodha.com/");
		  
		  //driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		  
		//  driver.navigate().to("file:///C:/Users/Shree/Desktop/Home.html");
		  
		 // driver.findElement(By.xpath("//a[contains(text(),'kite')]")).click();
		  
		//  ForgotPassword.click();
		  
		  System.out.println("Number of Images" +image.size());
		  
		  System.out.println(FacebookLinks.size());
		  
		  CreatenewAcc.click();
		  
		//  Thread.sleep(5000);
		  
		 // Explicit wait or WebDriverWait
		  
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		  
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']"))).sendKeys("Vishal");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 Thread.sleep(2000);
		 js.executeScript("alert('Hello')");
		 
		 FluentWait wait1 = new FluentWait(driver);
		 
		 wait1.withTimeout(5000,TimeUnit.MILLISECONDS);
		 
		 wait1.pollingEvery(250, TimeUnit.MILLISECONDS);
		 
		 wait1.ignoring(NoAlertPresentException.class);
		 
		 wait1.until(ExpectedConditions.alertIsPresent());
		 
		 Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
			{
				public Boolean apply(WebDriver arg0) {
					
					{
					//	driver.switchTo().alert().accept();
						return true;
					}
				}
			};

	wait1.until(function);
}

		  
		//  driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		//  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='websubmit']"))).click();
		  
		// WebElement FirstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		
		// FirstName.sendKeys("vishal");
		  
		 
		/*  try {
			Thread.sleep(5000);
			  driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Vishal");
			  driver.findElement(By.cssSelector("div>input[name='lastname']")).sendKeys("Repe");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  */
		 // CreateAPage.click();
		  
		// LoginBtn.click();
		  
		  //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("repevishal@gmail.com");
		 // driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		  
		   //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234874652");
		   
		   //driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		   
		   //driver.close();
	}

