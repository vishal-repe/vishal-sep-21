package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_Edge_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
	//	driver.close();

	}

}
