package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.WaitUtility;

public class FormSubmitByDataProviderPage {
	public WebDriver driver;
	By firstName =By.xpath("//input[@id='validationCustom01']");
	By lastName=By.xpath("//input[@id='validationCustom02']");
	By userName=By.xpath("//input[@id='validationCustomUsername']");
	By city=By.xpath("//input[@id='validationCustom03']");
	By state=By.xpath("//input[@id='validationCustom04']");
	By zip=By.xpath("//input[@id='validationCustom05']");
	By agreeButton=By.xpath("//input[@id='invalidCheck']");
	By submitFormButton=By.xpath("//button[@class='btn btn-primary']");
	By finalMessage=By.xpath("//div[@id='message-one']");
	
	public void submitFormWithDataProvider(String firstNameValue,String lastNameValue,String userNameValue,String cityValue,String stateValue,String zipValue) {
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		String actualMessage,expectedMessage="Form has been submitted successfully!";
		WebElement firstNameElement=driver.findElement(firstName);
		WebElement lastNameElement=driver.findElement(lastName);
		WebElement userNameElement=driver.findElement(userName);
		WebElement cityElement=driver.findElement(city);
		WebElement stateElement=driver.findElement(state);
		WebElement zipElement=driver.findElement(zip);
		WebElement agreeButtonCheckBox=driver.findElement(agreeButton);
		WebElement submitFormButtonElement=driver.findElement(submitFormButton);
		WebElement finalMessageElement=driver.findElement(finalMessage);
		firstNameElement.sendKeys(firstNameValue);
		lastNameElement.sendKeys(lastNameValue);
		userNameElement.sendKeys(userNameValue);
		cityElement.sendKeys(cityValue);
		stateElement.sendKeys(stateValue);
		zipElement.sendKeys(zipValue);
		if(agreeButtonCheckBox.isSelected()==false) {
			agreeButtonCheckBox.click();
			WaitUtility.waitForElementToBeSelectedWebelement(driver,agreeButtonCheckBox);
		}
		Assert.assertTrue(true, "Checkbox is already selected");
		submitFormButtonElement.click();
		WaitUtility.waitForElementClickable(driver,submitFormButtonElement);
		actualMessage=finalMessageElement.getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Actual and expected messages are different");
		
	}

	

}
