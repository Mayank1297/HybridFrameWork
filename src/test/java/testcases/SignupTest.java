package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.TestBase;
import testpages.RegistrationPage;

public class SignupTest extends TestBase {
	RegistrationPage RegistrationPage;
	
	public SignupTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		RegistrationPage= new RegistrationPage();
		
	}
	@Test
	public void RegistrationPageSignupbtn() {
		RegistrationPage.Signup();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
