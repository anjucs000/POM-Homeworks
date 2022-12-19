package com.obsqura.selenium.pageObjectModel_POM;

import org.testng.annotations.Test;

import pages.CommonHeaderMenusPage;
import pages.TablePage;

public class TablePageTest extends BasePOM{
	TablePage TablePageObj;
	CommonHeaderMenusPage CommonHeaderMenusPageObj;
	/*@Test(priority=0)
	public void verifyCommonHeaderMenu() {
		CommonHeaderMenusPageObj=new CommonHeaderMenusPage(driver);
		CommonHeaderMenusPageObj.locatePage("Table");
	}*/

	@Test(priority=1)
	public void verifyRowAndColumnCount() {
		CommonHeaderMenusPageObj=new CommonHeaderMenusPage(driver);
		CommonHeaderMenusPageObj.locatePage("Table");
		TablePageObj=new TablePage(driver);
		TablePageObj.findTableRowAndColumn(driver);
	}
	@Test(priority=2)
	public void verifyInputAndActual() {
		CommonHeaderMenusPageObj=new CommonHeaderMenusPage(driver);
		CommonHeaderMenusPageObj.locatePage("Table");
		TablePageObj=new TablePage(driver);
		TablePageObj.checkElementFoundInTable(driver);
	}
}
