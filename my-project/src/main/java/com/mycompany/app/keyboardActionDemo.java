package com.mycompany.app;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://demoqa.com/text-box");
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
		   driver.manage().window().maximize();
		   
		   Actions actions = new Actions(driver);
		   
		   driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		   
		   WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		   WebElement UserEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		   WebElement CurrAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		   WebElement PerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		   WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		   WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
		   
		   
		   
		   actions.sendKeys(UserName, "Vishal Repe").perform();
		   actions.sendKeys(UserEmail, "repevishal@gmail.com").perform();
		   actions.sendKeys(CurrAdd, "RamKrishna Nagar Pokhari road Ambajogai").perform();
		   actions.keyDown(CurrAdd, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		   actions.keyDown(CurrAdd, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		   actions.sendKeys(CurrAdd, Keys.TAB).build().perform();
		   actions.moveToElement(SubmitBtn).build().perform();
		   actions.keyDown(PerAdd, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		   actions.moveToElement(links).perform();
		   actions.click(SubmitBtn).build().perform();

	}

}
