package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Mayank Verma\\eclipse-workspace"
				+ "\\HybridAutomationFrameWork\\src\\main\\java\\configfiles\\config.properties");
		prop.load(ip);
	}
	
	public static void initilization() {
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
	}
	

}
