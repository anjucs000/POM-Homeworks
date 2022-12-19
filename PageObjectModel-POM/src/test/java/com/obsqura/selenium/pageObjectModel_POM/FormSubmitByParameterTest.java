package com.obsqura.selenium.pageObjectModel_POM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FormSubmitPageByParameter;

public class FormSubmitByParameterTest extends BasePOM {
	FormSubmitPageByParameter obj;

	@Test
	@Parameters({"firstNameValue","lastNameValue","userNameValue","cityValue","stateValue","zipValue"})
	public void checkAndVerifyParameterWithTestNG(String firstNameValue,String lastNameValue, String userNameValue, String cityValue, String stateValue, String zipValue) {
		obj=new FormSubmitPageByParameter();
		obj.submitFormWithParameterTestNG(firstNameValue, lastNameValue, userNameValue, cityValue, stateValue, zipValue);
		
	}

}
