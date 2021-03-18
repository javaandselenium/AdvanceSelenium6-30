package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/disabled.html");
		WebElement ele = driver.findElement(By.id("t1"));
System.out.println(ele.isEnabled());

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("document.getElementById('t1').value='qwerty'");

Thread.sleep(3000);

js.executeScript("document.getElementById('t1').value=''");

	}

}
