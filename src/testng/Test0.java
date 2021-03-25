package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test0 {
	@BeforeMethod()
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod()
	public void logout() {
		Reporter.log("logout",true);
	}

	@Test(groups="createcustomer")
	public void createcustomer() {
		Reporter.log("createcustomer",true);
		Reporter.log("hello",true);
	}
	
	@Test(groups="deletecustomer")
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
		Reporter.log("createcustomer",true);
	}
	
	@Test()
	public void createProject() {
		Reporter.log("createproject",true);
	}
	
	@Test(groups={"deleteproject","smoke"})
	public void deleteproject() {
		Reporter.log("deleteproject",true);
	}
	
}
