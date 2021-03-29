package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
@DataProvider
public Object[][] getdata() {
	Object[][] a=new Object[5][3];
	a[0][0]="qwerty123";
	a[0][1]="mang0890";
	
	a[1][0]="233234434545454";
	a[1][1]="665675765464576";
	
	a[2][0]="wewr4345%$%^$^%";
	a[2][1]="rtytyty45545@%#%%";
	
	
	return a;
	}

@Test(dataProvider ="getdata")
public void login(String pwd,String us) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(us);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	Reporter.log(driver.getTitle(),true);
}

}
