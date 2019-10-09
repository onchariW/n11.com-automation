
/*
 * this is one of the base class and it generates/instantiates the pages.
 * PageFactory.initElements(driver, pageClass) is used to instantiate the pages because all the elements have to be found on.
 * Java Generic is used to get the class of a page and return the generated/instantiated pages which extends fron base class
 * https://www.swtestacademy.com/page-factory-selenium-webdriver/
 */
package www.n11.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
	public WebDriver driver;
	
	
	public PageGenerator(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	
	//Generic method to create and return a new page
	public <T extends BasePage> T GetInstance(Class<T> pageClass) {
			//initiliaze the page with its elements and return it.
			return PageFactory.initElements(driver, pageClass);	
	}

}
