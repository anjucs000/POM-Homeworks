package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommonHeaderMenusPage {
	WebDriver driver;
	By headerMenus=By.xpath("//li[@class='nav-item']//child::a");

	public CommonHeaderMenusPage(WebDriver driver) {
		this.driver=driver;
	}
	public void locatePage(String input) {
		List<WebElement> menuElements=driver.findElements(headerMenus);
		Boolean flag=false;
		for(WebElement item:menuElements) {
			if(item.getText().equalsIgnoreCase(input)) {
				item.click();
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag, "Menu items are not clickable");
	}
}