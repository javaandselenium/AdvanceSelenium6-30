package dynamicCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		String month="2";
		String year="2023";
		String date="2";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		while(true) {
			try {
				driver.findElement(By.xpath("//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+date+"']")).click();
			}
		catch(Exception e)
		
		
			{
		driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
		

	}
		}}}
		


