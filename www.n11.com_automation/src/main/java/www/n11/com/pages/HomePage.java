package www.n11.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.CLASS_NAME, using = "btnSignIn")
	public WebElement signInButton;
	
	String baseURL = "http://www.n11.com/";
	
	//GO to homepage
	public void goToN11() {
		driver.get(baseURL);
	}
	
	public LoginPage goToLoginPage() {
		click(signInButton);
		return new PageFactory().initElements(driver, LoginPage.class);
	}

}
