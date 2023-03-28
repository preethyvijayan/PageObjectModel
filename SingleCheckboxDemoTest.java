package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.SelectCategoryPage;
import com.obsqura.pages.SingleCheckboxDemoPage;

public class SingleCheckboxDemoTest extends Base {
	SelectCategoryPage selectcategorypage;
	SingleCheckboxDemoPage singlecheckboxdemopage;
	@Test
	public void verifySingleCheckboxDemo()
	{
		String input="Checkbox Demo";
		String expecteddisplayMessage="Success - Check box is checked";
		selectcategorypage=new SelectCategoryPage(driver);
		selectcategorypage.toClickSelectCategory(input);
		singlecheckboxdemopage=new SingleCheckboxDemoPage(driver);
		assertFalse(singlecheckboxdemopage.singleCheckboxDemoElementisEnabled()==false, "Single check box is selected");
		singlecheckboxdemopage.toClickSinglecheckbox();
		assertTrue(singlecheckboxdemopage.toDisplatmessageisDisplayed()==true, "Display message is not displayed");
		String actualdisplayMessage= singlecheckboxdemopage.toDisplayMessage();
		assertEquals(actualdisplayMessage, expecteddisplayMessage, "Actual display message and expected display message for check box is not same");
	}

}
