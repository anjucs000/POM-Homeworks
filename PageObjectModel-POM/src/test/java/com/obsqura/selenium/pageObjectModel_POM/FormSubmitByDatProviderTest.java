package com.obsqura.selenium.pageObjectModel_POM;

import org.testng.annotations.Test;

import pages.FormSubmitByDataProviderPage;
import parameters.DataProviderUtility;


public class FormSubmitByDatProviderTest extends BasePOM{
	FormSubmitByDataProviderPage obj;
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderUtility.class)
	public void verifyDataProviderMethod(String firstNameValue,String lastNameValue, String userNameValue, String cityValue, String stateValue, String zipValue) {
		obj=new FormSubmitByDataProviderPage();
		obj.submitFormWithDataProvider(firstNameValue, lastNameValue, userNameValue, cityValue, stateValue, zipValue);
	}
	

}
