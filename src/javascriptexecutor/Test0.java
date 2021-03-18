package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
         js.executeScript("arguments[0].click()",ele);
         
        String s = js.executeScript("return document.URL;").toString();
         System.out.println(s);
         
         String t = js.executeScript("return document.title;").toString();
         System.out.println(t);
         Thread.sleep(3000);
         
         js.executeScript("history.go(0)");
         
         
	}

}
