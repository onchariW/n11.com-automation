package www.n11.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	   //*********Web Elements by using Page Factory*********
    @FindBy(how = How.ID, using = "email")
    public WebElement username;
 
    @FindBy(how = How.ID, using = "password")
    public WebElement password;
 
    @FindBy(how = How.ID, using = "loginButton")
    public WebElement loginButton;
 
    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[1]/div/div")
    public WebElement errorMessageUsername;
 
    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[2]/div/div")
    public WebElement errorMessagePassword;
	
	public void loginToN11(String user, String pass) {
		writeText(username, user);
		writeText(password, pass);
	}
	
	public void verifyLoginUsername(String expectedText) {
		Assert.assertEquals(readText(errorMessageUsername), expectedText);
	}
	
	 //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(errorMessagePassword), expectedText);
    }

	
}
