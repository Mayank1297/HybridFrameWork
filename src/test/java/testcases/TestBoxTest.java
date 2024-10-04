package testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import testpages.TestBoxPage;

public class TestBoxTest extends BaseClass {
	TestBoxPage ob;
	public TestBoxTest() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@BeforeTest
	public void LauchURL() throws InterruptedException, IOException {
		getBrowser();
		ob=new TestBoxPage();
	} 
	
	@Test(priority = 0)
	public void clickelements() {
		ob.clickelements();
	}
	
	@Test(priority = 1)
	public void clicktextbox() {
		ob.clicktextbox();
	}
	
	@Test(priority = 2)
	public void FullName() {
		ob.FullName();
	}
	
	@Test(priority = 3)
	public void Email() {
		ob.Email();
	}
	
	@Test(priority = 4)
	public void CurrentAddress() {
		ob.CurrentAddress();
	}
	
	@Test(priority = 5)
	public void PermanentAddress() {
		ob.PermanentAddress();
	}
	
	@Test(priority = 6)
	public void clicksubmitbutton() {
		ob.clicksubmitbutton();
	}
	
	@Test(priority = 7)
	public void verify() {
		ob.verifyname();
		ob.verifyemail();
		ob.verifycurrentaddress();
		ob.verifypermanentaddress();
	}

}
