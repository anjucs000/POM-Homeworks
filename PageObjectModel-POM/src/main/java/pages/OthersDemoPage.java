package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OthersDemoPage {
	
	public WebDriver driver;
	By DragAndDropMenu=By.xpath("//a[@href='drag-drop.php']//parent::li[@class='list-group-item']");
	By dragElement1=By.xpath("//span[text()='Draggable nÂ°1']");
	By droppedItem=By.id("mydropzone");
	
	public void dragAndDropElement() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragElement1Webelement,droppedItemElement;
		dragElement1Webelement=driver.findElement(dragElement1);
		droppedItemElement=driver.findElement(droppedItem);
		Actions action=new Actions(driver);
		action.dragAndDrop(dragElement1Webelement, droppedItemElement).click().perform();
		
	}
	

}

