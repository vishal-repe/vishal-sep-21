package com.mycompany.app;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	       WebDriver driver=new ChromeDriver(options);
	       
	       driver.get("https://demo.guru99.com/test/delete_customer.php");
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//tr[2]//td[2]//input")).sendKeys("1234");
		   driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).click();
		   driver.switchTo().alert().dismiss();
		   
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).click();
		   System.out.println(driver.switchTo().alert().getText());
		   
		   driver.switchTo().alert().accept();
		   Thread.sleep(1000);
		   
		   System.out.println(driver.switchTo().alert().getText());
		   driver.switchTo().alert().accept();
		   
		  // driver.navigate().to("file:///C:/Users/Shree/Desktop/webtable.html");
		   //System.out.println(driver.findElement(By.xpath("//tr[1]//th")).getText());
		   //driver.findElement(By.xpath("//tr[2]//td[2]//input")).sendKeys("123456");
		   //driver.findElement(By.xpath("//tr[3]//td[1]//button")).click();
		   
		  //input[@name='cusid']
		  ////tr[2]//td[2]//input 

	}

}
