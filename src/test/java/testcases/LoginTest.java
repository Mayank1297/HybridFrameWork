package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import testpages.Login_Page;

public class LoginTest extends BaseClass {
	Login_Page ob;

	public LoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void LauchURL() throws InterruptedException, IOException {
		getBrowser();
		ob=new Login_Page();
	}
	
	@Test
	public void pageTitel() {
		ob.get_Titel();
	}
}
