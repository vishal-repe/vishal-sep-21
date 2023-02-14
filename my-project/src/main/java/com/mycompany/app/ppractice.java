package com.mycompany.app;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ppractice {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
        
	//	WebElement username = driver.findElement(By.xpath("//input[@id='emai' or contains(@class,'inputtext _55r1 _6luy')]"));
	//	WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	//	WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy') and contains(@id,'u_0_5')]"));
		
		WebElement ForgotPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		
		WebElement username = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[id=email]"));
		WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[name=pass]"));
		WebElement CreatenewAcc = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
		
		driver.navigate().to("https://demoqa.com/droppable/");
		
		
		username.sendKeys("repevishal@gmail.com");
		password.sendKeys("123456");
		CreatenewAcc.click();
		
	//	Implicit Wait 
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	//	WebElement FirstName = driver.findElement(By.cssSelector("input[name='firstname']"));
	//	FirstName.sendKeys("vishal");
		
	// Explicit Wait	
	//	WebDriverWait wait = new WebDriverWait(driver,10);
		
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='firstname']"))).sendKeys("vishal");
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']"))).sendKeys("vishal");
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name ='websubmit']"))).click();
	/*	try {
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("vishal");
			driver.findElement(By.cssSelector("div>input[name=lastname]")).sendKeys("repe");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		*/
	//	ForgotPassword.click();
		
	//	LoginBtn.click();
	}

}
