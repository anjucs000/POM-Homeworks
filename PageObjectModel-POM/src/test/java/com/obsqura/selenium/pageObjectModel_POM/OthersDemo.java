package com.obsqura.selenium.pageObjectModel_POM;

import org.testng.annotations.Test;

import pages.OthersDemoPage;

public class OthersDemo extends BasePOM {
	
	OthersDemoPage obj;
	@Test
	public void dragAndDropMethod() {
		obj=new OthersDemoPage();
		obj.dragAndDropElement();
	}

}
