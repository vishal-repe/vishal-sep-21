package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
	}

}
