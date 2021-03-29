package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Tc1 extends Baseclass{
	
	
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("ghdfhfdg");
		driver.findElement(By.id("pass")).sendKeys("jgjfjgh");
		driver.findElement(By.name("login")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
		
	}
	
	
}
