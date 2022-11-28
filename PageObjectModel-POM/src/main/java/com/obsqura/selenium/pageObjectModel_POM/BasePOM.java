package com.obsqura.selenium.pageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePOM {
public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\PageObjectModel-POM\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

}
