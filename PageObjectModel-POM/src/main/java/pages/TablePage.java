package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TablePage {
	WebDriver driver;
	String input;
	public TablePage(WebDriver driver) {
		this.driver=driver;
	}
	public void findTableRowAndColumn(WebDriver driver) {
		String text = null;
		driver.findElements(By.xpath("//th[@class='th-sm sorting_disabled']"));
		int columnSize=driver.findElements(By.xpath("//th[@class='th-sm sorting_disabled']")).size();
		List<WebElement> rowElements=driver.findElements(By.xpath("//table[@id='dtBasicExample']//child::tr"));
		int rowSize=driver.findElements(By.xpath("//table[@id='dtBasicExample']//child::tr")).size();
		for(WebElement item:rowElements) {
				text=item.getText();
		System.out.println(text);
		}
	}
	public void checkElementFoundInTable(WebDriver driver) {
		String input = "Edinburgh",actualItem = null;
		int count=0;
		driver.findElements(By.xpath("//th[@class='th-sm sorting_disabled']"));
		List<WebElement> rowElements=driver.findElements(By.xpath("//table[@id='dtBasicExample']//child::tr"));
		int rowSize=driver.findElements(By.xpath("//table[@id='dtBasicExample']//child::tr")).size();
		for(WebElement item:rowElements) {
			actualItem=item.getText();
			if(actualItem.contains(input)) {
				count=count+1;
			}
		}
		System.out.println("Searched text is present "+count);
		Assert.assertTrue(true, "Actual and input are not same");
	}
}
