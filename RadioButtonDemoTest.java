package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.RadioButtonDemoPage;
import com.obsqura.pages.SelectCategoryPage;

public class RadioButtonDemoTest extends Base {
	SelectCategoryPage selectcategorypage;
	RadioButtonDemoPage radiobuttonpage;
	
	@Test(priority=1)
	public void verifyRadiobuttonDemo()
	{
		String input="Radio Buttons Demo";
		String expectedMessage="Radio button 'Female' is checked";
		selectcategorypage=new SelectCategoryPage(driver);
		radiobuttonpage=new RadioButtonDemoPage(driver);
		selectcategorypage.toClickSelectCategory(input);
		boolean checkmaleRadiobuttonElement= radiobuttonpage.maleRadiobuttonElementisEnabled();
		boolean checkfemaleRadiobuttonElement=radiobuttonpage.femaleRadiobuttonElementisEnabled();
		assertFalse(checkmaleRadiobuttonElement&&checkfemaleRadiobuttonElement==false, "male radio button and female radio button is enabled");
		radiobuttonpage.toclickRadiobutton();
		boolean checkselectionoffemaleradiobutton=radiobuttonpage.femaleRadiobuttonElementisSelected();
		assertTrue(checkselectionoffemaleradiobutton==true,"Female radio button is not selected" );
		radiobuttonpage.toClickshowSelectedValuebutton();
		String actualMessage=radiobuttonpage.toDisplaymessage();
		assertEquals(actualMessage, expectedMessage, "Actual display message and expected display message are not same");
	}
	@Test(priority=2)
	public void verify_dummy1()
	{
		
	}
	@Test(priority=3)
	public void verify_dummy2()
	{
		
	}

}
