package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormDemoPage {

	WebDriver driver;
	By enterMessageField=By.xpath("//input[@id='single-input-field']");
	By showMessage=By.xpath("//button[@id='button-one']");
	By yourMessage=By.xpath("//div[@id='message-one']");
	public SimpleFormDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySingleInputField() {
		String inputMessage="Test",actualMessage;
		String expectedMessage="Your Message : "+inputMessage;
		driver.findElement(enterMessageField).sendKeys(inputMessage);
		driver.findElement(showMessage).click();
		actualMessage=driver.findElement(yourMessage).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Expected and actual outputs are not same");
		}
}
