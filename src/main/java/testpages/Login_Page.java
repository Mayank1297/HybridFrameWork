package testpages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class Login_Page extends TestBase {

	
	public Login_Page() throws IOException {
		super();
	}

	public void get_Titel() {
		String titel=driver.getTitle();
		System.out.println(titel);
	}
	
}
