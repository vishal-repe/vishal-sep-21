package com.mycompany.app;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ppractise_window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String MainWindow = driver.getWindowHandle();
		Set<String>childwindows = driver.getWindowHandles();
		
		Iterator<String>itr = childwindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
			//	driver.close();
			}
		}driver.switchTo().window(MainWindow);
	//	driver.close();
	//	driver.quit();
	}

}