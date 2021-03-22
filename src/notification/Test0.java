package notification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test0 {

	public static void main(String[] args) {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		//FirefoxOptions f=new FirefoxOptions();
		
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("DepartDate")).click();

	}

}
