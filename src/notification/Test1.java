package notification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) {
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
