package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectInputPage {
	public WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actualMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']");
	
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectInputPage() {
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputSelect.selectByVisibleText("Red");

	}
	public void verifySelectMultipleInputColor() {

		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		multipleSelect.isMultiple();
		multipleSelect.selectByVisibleText("Red");
		multipleSelect.selectByVisibleText("Yellow");
		multipleSelect.selectByVisibleText("Green");
		driver.findElement(getAllSelectedButton).click();
	}
}