package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 8 plus mobile");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 Mini (64GB) - Blue']/ancestor::div[@class='rush-component'][2]//span[@class='a-price']")).click();
	Set<String> child = driver.getWindowHandles();
	
	for(String b:child) {
		driver.switchTo().window(b);
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	}

}
