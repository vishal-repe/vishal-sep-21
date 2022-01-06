package selenium_java_sep_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
	}

}
