package com.mycompany.app;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@data-testid,'email')]"));
		
		WebElement password = driver.findElement(By.cssSelector("input#pass[data-testid='royal_pass']"));
		
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		
	//	WebElement CreateAPage = driver.findElement(By.className("_8esh")); 
		
		WebElement CreateNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		
		WebElement ForgotPass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		
		username.sendKeys("repevishal@gmail.com");
		
		password.sendKeys("1253648");
		
	//	driver.navigate().to("https://kite.zerodha.com");
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		
	//	driver.get("file:///C:/Users/Shree/Desktop/Home2.html");
		
  //	driver.findElement(By.xpath("//a[contains(text(),'Kite')]")).click();
		
		
		
		System.out.println("Number of images " +img.size());
		
	//	driver.findElement(By.linkText("Meta Pay")).click();
		
		ForgotPass.click();
		
	//	CreateNewAccount.click();
	/*	
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("vishal");
			driver.findElement(By.cssSelector("div>input[name='lastname']")).sendKeys("repe");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/	
		
	//	CreateAPage.click();
		
	//	LoginBtn.click();
		
		
	

	}

}
