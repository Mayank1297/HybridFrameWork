package testpages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseclass.BaseClass;

public class TestBoxPage extends BaseClass {
	
	public TestBoxPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	String inputname="Test User";
	String inputemail="testuser@yopmail.com";
	String inputcaddress="test current address";
	String inputpaddress="test permanent address";
	
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
	
	@FindBy(xpath = "//div[@class='col-md-6 mt-5']/label[@id='fullname']")
	private WebElement verifyName;
	
	@FindBy(xpath = "//div[@class='col-md-6 mt-5']/label[@id='fullemail']")
	private WebElement verifyEmail;
	
	@FindBy(xpath = "//div[@class='col-md-6 mt-5']/label[@id='fulladdresh']")
	private WebElement verifyCurrentAddress;
	
	@FindBy(xpath = "//div[@class='col-md-6 mt-5']/label[@id='paddresh']")
	private WebElement verifyPermanentAddress;
	
	public void clickelements() {
		elements.click();
	}
	
	public void clicktextbox() {
		textbox.click();
	}
	
	public void FullName() {
		fullname.sendKeys(inputname);
	}
	
	public void Email() {
		email.sendKeys(inputemail);
	}
	
	public void CurrentAddress() {
		currentaddress.sendKeys(inputcaddress);
	}
	
	public void PermanentAddress() {
		permanentaddress.sendKeys(inputpaddress);
	}
	
	public void clicksubmitbutton() {
		submitbutton.click();
	}
	
	public void verifyname() {
		String actualname=verifyName.getText();
		Assert.assertEquals(actualname, inputname);
	}
	
	public void verifyemail() {
		String actualemail=verifyEmail.getText();
		Assert.assertEquals(actualemail, inputemail);
	}
	
	public void verifycurrentaddress() {
		String actualcurrentaddress=verifyCurrentAddress.getText();
		Assert.assertEquals(actualcurrentaddress, inputcaddress);
	}
	
	public void verifypermanentaddress() {
		String actualpermanentaddress=verifyPermanentAddress.getText();
		Assert.assertEquals(actualpermanentaddress, inputpaddress);
	}
		
}
