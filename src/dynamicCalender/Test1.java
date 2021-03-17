package dynamicCalender;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Date d=new Date();
		LocalDateTime d1=LocalDateTime.now();
		int year = d1.getYear();
		System.out.println(year);
		
		Date d=new Date();
		int getdate = d.getDate();
		System.out.println(getdate);
		
		int getmonth = d.getMonth();
		System.out.println(getmonth);
		

	
		driver.findElement(By.id("DepartDate")).click();
		
	
		
driver.findElement(By.xpath("//td[@data-month='"+getmonth+"' and @data-year='"+year+"']/a[text()='"+getdate+"']")).click();
	}

}
