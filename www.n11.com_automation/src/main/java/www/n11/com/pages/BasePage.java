package www.n11.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageGenerator {

	public BasePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	//Click method using Java generic (uses both By or WebElement
	public <T> void click(T elementAtrr) {
		if(elementAtrr.getClass().getName().contains("By")) {
			driver.findElement( (By) elementAtrr).click();
		}else {
			((WebElement)elementAtrr).click();
		}
	}
	
	public <T>void writeText(T elementAttr, String text) {
		if(elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By)elementAttr).sendKeys(text);
		}else {
			((WebElement)elementAttr).sendKeys(text);
		}
	}
	
	public <T> String readText(T elementAttr) {
		if(elementAttr.getClass().getName().contains("By")) {
			return driver.findElement((By) elementAttr).getText();		
		}else {
			return ((WebElement) elementAttr).getText();
		}
	}

}
