package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

public class Test5 {

	public static void main(String[] args) throws SQLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//load the database
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		//connect to db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
		
		//create statement
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from users");
		
		while(result.next()) {
			System.out.println(result.getString(1)+"  "+result.getString(2));
		
		driver.findElement(By.id("username")).sendKeys(result.getString(1));
		driver.findElement(By.name("pwd")).sendKeys(result.getString(2));
		}
		
		
		
	}

}
