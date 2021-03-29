package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc2 extends Baseclass {

	
	
	@Test
	public void clickonlink() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
	}


}
