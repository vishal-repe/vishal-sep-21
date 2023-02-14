package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class launch_kite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0634");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123564");
		
	//	driver.findElement(By.cssSelector("button[class='button-orange wide']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();

	}

}
