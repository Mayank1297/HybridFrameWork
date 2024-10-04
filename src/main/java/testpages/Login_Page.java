package testpages;

import java.io.IOException;


import baseclass.BaseClass;

public class Login_Page extends BaseClass {

	
	public Login_Page() throws IOException {
		super();
	}

	public void get_Titel() {
		String titel=driver.getTitle();
		System.out.println(titel);
	}
	
}
