package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_kite_2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://kite.zerodha.com");
	
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA544569");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1253456");
	
	driver.findElement(By.cssSelector("button[class='button-orange wide']")).click();

	}

}