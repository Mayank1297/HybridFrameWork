package testpages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class RegistrationPage extends TestBase {
	

	@FindBy(xpath = "//a[@class='btn btn-sm btn-white btn-icon btn-icon-left "
			+ "btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement Signupbtn;  
	
	
	
	
	public RegistrationPage() throws IOException {
        PageFactory.initElements(driver, this);
    }
	
	public void Signup() {
		Signupbtn.click();
	}
	
	
	
	
	
	
	
	
}
