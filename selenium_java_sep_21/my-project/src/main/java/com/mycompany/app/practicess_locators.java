package com.mycompany.app;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicess_locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
	//	WebElement Loginbtn = driver.findElement(By.name("login"));
	//	WebElement CreateAPage = driver.findElement(By.className("_8esh"));
		
	//	WebElement CreateNewAccount = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	//	WebElement Forgotpass = driver.findElement(By.partialLinkText("Forgotten p"));
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement>image = driver.findElements(By.tagName("img"));
		System.out.println("Number of images" +  image.size());
		
		username.sendKeys("repevishal@gmail.com");
		Password.sendKeys("1256489");
		
	//	driver.findElement(By.linkText("facebookPay")).click();
	//	Loginbtn.click();
	//	CreateAPage.click();
	//	CreateNewAccount.click();
	//	Forgotpass.click();
		
	}

}
