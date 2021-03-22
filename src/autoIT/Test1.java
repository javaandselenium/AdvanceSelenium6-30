package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\AutoITdemo\\Fileupload.exe");
		
		

	}

}
