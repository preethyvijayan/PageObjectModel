package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.obsqura.pages.SimpleInputformDemoPage;

public class SimpleInputformDemoTest  extends Base{
	SimpleInputformDemoPage simpleinputformdemopage;
@Test
public void verifySingleInputField()
{
	String inputString="ABC";
	String value=null;
	String expectedValue="Your Message : ABC";
	simpleinputformdemopage=new SimpleInputformDemoPage(driver);
	simpleinputformdemopage.enterDatainInputfieldForm(inputString);
	simpleinputformdemopage.clickOnShowMessageButton();
	String actualValue=simpleinputformdemopage.simpleInputfieldGettext(value);
	assertEquals(actualValue, expectedValue, "Actual value and expected value are not same");
	
}
}
