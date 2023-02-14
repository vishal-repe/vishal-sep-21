package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practices_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com");
		String url ="https://www.facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("repevishal@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("456225223");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		//driver.close();
	}
}
