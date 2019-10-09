package www.n11.com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import www.n11.com.pages.PageGenerator;

public class BaseTest {

	//declare chrome driver
	// delcare wait for test method
	//maximize the browser
	//instanitate the pagegenerator class
	//tear down the browser
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	public PageGenerator page;
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		
		page = new PageGenerator(driver);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
