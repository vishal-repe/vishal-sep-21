package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchedge {
	
 public static void main(String[] args) {
	 System.setProperty("webdriver.edge.driver","F:\\msedgedriver.exe ");
	 WebDriver driver=new EdgeDriver();
	 
	 String url = "https://www.facebook.com";
	 
	 driver.get(url);
	 
	 driver.navigate().to("https://www.google.com/");
	 
	 driver.manage().window().maximize();
	 
	 driver.navigate().back();
	 
	 driver.navigate().forward();
	 
	 driver.navigate().refresh();
	 driver.close();
 }
 
}
 
