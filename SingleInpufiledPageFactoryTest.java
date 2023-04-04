package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.SingleInputFieldPageFactoryPage;

import utilities.ExcelUtility;

public class SingleInpufiledPageFactoryTest extends Base{
	SingleInputFieldPageFactoryPage singleinputfieldPagefactorypage;

	//@Test
	public void verifySingleInputField() throws IOException
	{
		
		System.out.println("haiii");
		String value=ExcelUtility.getString(0, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");
		String expectedValue="Your Message : "+ value;
		singleinputfieldPagefactorypage=new SingleInputFieldPageFactoryPage(driver);
		singleinputfieldPagefactorypage.enterDatainInputfieldForm(value);
		singleinputfieldPagefactorypage.clickOnShowMessageButton();
		String actualValue=singleinputfieldPagefactorypage.simpleInputfieldGettext();
		assertEquals(actualValue, expectedValue, "Actual value and expected value are not same");
	}
	@Test
	@Parameters({"text"})
	public void verifySingleInputFieldParameters(String text1)
	{
		String expectedValue="Your Message : "+ text1;
		singleinputfieldPagefactorypage=new SingleInputFieldPageFactoryPage(driver);
		singleinputfieldPagefactorypage.enterDatainInputfieldForm(text1);
		singleinputfieldPagefactorypage.clickOnShowMessageButton();
		String actualValue=singleinputfieldPagefactorypage.simpleInputfieldGettext();
		assertEquals(actualValue, expectedValue, "Actual value and expected value are not same");
	}

}
