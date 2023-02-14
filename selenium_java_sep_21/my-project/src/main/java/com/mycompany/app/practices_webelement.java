package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practices_webelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("repevishal@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Password.sendKeys("132458");
		
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		LoginBtn.click();

	}

}
