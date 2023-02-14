package com.mycompany.app;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://www.naukri.com/");
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
		   driver.manage().window().maximize();
		   
		   Actions actions = new Actions(driver);
		   
		   WebElement JobsTab = driver.findElement(By.xpath("//div[contains(text(),'Jobs')]"));
		   
		   actions.moveToElement(JobsTab).perform();
		   
		   WebElement Reportissue = driver.findElement(By.xpath("//a[contains(text(),'Report issue')]"));
		   actions.moveToElement(Reportissue).perform();
		   Thread.sleep(3000);
		   
		   driver.navigate().to("https://demoqa.com/buttons");
		   
		   WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		   
		   WebElement RightClickBTn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		   
		   WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		   
		   actions.doubleClick(DoubleClickBtn).perform();
		   actions.contextClick(RightClickBTn).perform();
		   actions.click(DynamicClickBtn).perform();
		   
		   driver.navigate().to("https://demoqa.com/droppable/");
		   WebElement DragMeBtn = driver.findElement(By.xpath("//div[@id='draggable']"));
		   WebElement DropHereBtn = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		   
		   actions.dragAndDrop(DragMeBtn, DropHereBtn).perform();
		   
		   driver.navigate().to("https://demoqa.com/tool-tips");
		   
		   WebElement HoverMetoSeeBtn = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		   
		   actions.moveToElement(HoverMetoSeeBtn).perform();
		   
		   System.out.println(driver.findElement(By.xpath("//button[@id='toolTipButton']")).getText());
		   
		   WebElement TextBox = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		   
		   actions.keyDown(TextBox, Keys.SHIFT).sendKeys("TextToBeConvertAndSendInUpperCase").keyUp(Keys.SHIFT).build().perform();

	}

}
