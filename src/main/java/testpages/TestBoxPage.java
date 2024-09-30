package testpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class TestBoxPage extends TestBase {
	
	public TestBoxPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement fullname;
	
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement currentaddress;
	
	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement permanentaddress;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submitbutton;
	
	public void clickelements() {
		elements.click();
	}
	
	public void clicktextbox() {
		textbox.click();
	}
	
	public void FullName() {
		fullname.sendKeys("Test User");
	}
	
	public void Email() {
		email.sendKeys("testuser@yopmail.com");
	}
	
	public void CurrentAddress() {
		currentaddress.sendKeys("test current address");
	}
	
	public void PermanentAddress() {
		permanentaddress.sendKeys("test permanent address");
	}
	
	public void clicksubmitbutton() {
		submitbutton.click();
	}
	
}
