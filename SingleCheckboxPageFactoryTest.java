package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.SelectCategoryPage;
import com.obsqura.pages.SingleCheckboxDemoPage;
import com.obsqura.pages.SingleCheckboxPageFactoryPage;

public class SingleCheckboxPageFactoryTest extends Base {
	SelectCategoryPage selectcategorypage;
	SingleCheckboxPageFactoryPage singlecheckboxpagefactorypage;
	@Test
	public void verifySingleCheckboxDemo()
	{
		String input="Checkbox Demo";
		String expecteddisplayMessage="Success - Check box is checked";
		selectcategorypage=new SelectCategoryPage(driver);
		selectcategorypage.toClickSelectCategory(input);
		singlecheckboxpagefactorypage=new SingleCheckboxPageFactoryPage(driver);
		assertFalse(singlecheckboxpagefactorypage.singleCheckboxDemoElementisEnabled()==false, "Single check box is selected");
		singlecheckboxpagefactorypage.toClickSinglecheckbox();
		assertTrue(singlecheckboxpagefactorypage.toDisplatmessageisDisplayed()==true, "Display message is not displayed");
		String actualdisplayMessage= singlecheckboxpagefactorypage.toDisplayMessage();
		assertEquals(actualdisplayMessage, expecteddisplayMessage, "Actual display message and expected display message for check box is not same");
	}
}
