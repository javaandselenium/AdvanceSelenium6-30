package sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(ele,200,0).perform();
		
		Thread.sleep(3000);
		a.dragAndDropBy(ele,-200,0).perform();
		
		

	}

}
