package www.n11.com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import www.n11.com.pages.HomePage;
import www.n11.com.pages.LoginPage;

public class LoginTests extends BaseTest{

	@Test
	public void invalidLoginTest_InvalidUsernameInvalidPassword() {
		//open n11 page
		//initialize elements by page factory
		
		page.GetInstance(HomePage.class).goToN11();
		
		//chain of invocation 
		page.GetInstance(HomePage.class).goToLoginPage().loginToN11("onur@swtestacademy.com", "11223344");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='E-posta adresiniz veya şifreniz hatalı']")));
		page.GetInstance(LoginPage.class).verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
	}
}
