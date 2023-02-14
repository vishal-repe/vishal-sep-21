package com.mycompany.app;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://www.naukri.com/");
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
		   driver.manage().window().maximize();
		   
		   TakesScreenshot ts = (TakesScreenshot)driver;
		  File srcfile = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(srcfile, new File("C:\\Users\\Shree\\eclipse-workspace\\Java_selenium_21\\"+timestamp()+".jpg"));
	}
		  public static String timestamp() {
			  return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		  }
		   

	}


