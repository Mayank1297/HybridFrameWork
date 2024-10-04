package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	 static String closebtn="//button[text()='×']";
	 static String practice="//a[text()='Practice']";
	
	public BaseClass() throws IOException {
		
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Admin\\git\\HybridFrameWork\\src\\main\\java\\configfiles\\config.properties");
		prop.load(ip);
	}
	
	public static void getBrowser() throws InterruptedException {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(closebtn)).click();
		driver.findElement(By.xpath(practice)).click();
		
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
