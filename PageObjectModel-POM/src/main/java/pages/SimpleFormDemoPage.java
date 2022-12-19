package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPage {

	WebDriver driver;
	By enterMessageField=By.xpath("//input[@id='single-input-field']");
	By showMessage=By.xpath("//button[@id='button-one']");
	By yourMessage=By.xpath("//div[@id='message-one']");
	By enterValueAField=By.xpath("//input[@id='value-a']");
	By enterValueBField=By.xpath("//input[@id='value-b']");
	By getTotalField=By.xpath("//button[@id='button-two']");
	By totalAplusBField=By.xpath("//div[@id='message-two']");
	By dragAndDrop=By.xpath("//a[@href='drag-drop.php' and text()='Drag and Drop']");
	public SimpleFormDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyTitle() throws IOException {
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		String expectedTitle,actualTitle;
		expectedTitle=ExcelUtility.getStringMultiColor(0, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Simple Form Demo");
		WaitUtility.waitForTitleContains(driver, expectedTitle);
		actualTitle=driver.getTitle();
		WaitUtility.waitForTitleIs(driver, actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Actual and expected titles are not same");
	}
	public void verifySingleInputField() throws IOException {
		
		String inputMessage=ExcelUtility.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Simple Form Demo");
		String expectedText=ExcelUtility.getStringMultiColor(2, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Simple Form Demo");
		String actualMessage,expectedMessage=expectedText+inputMessage;
		//driver.findElement(enterMessageField).sendKeys(inputMessage);
		PageUtility.enterText(driver.findElement(enterMessageField), inputMessage);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
		//wait.until(ExpectedConditions.elementToBeClickable(showMessage));
		WebElement showMessageWebElement=driver.findElement(showMessage);
		WaitUtility.waitForElementClickable(driver, showMessageWebElement);
		showMessageWebElement.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(yourMessage));
		actualMessage=driver.findElement(yourMessage).getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Expected and actual outputs are not same");
		}
	public void DragAndDropMethod() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		Actions action=new Actions(driver);
		WebElement dragAndDropElement=driver.findElement(dragAndDrop);
		action.click(dragAndDropElement);
	}
}
