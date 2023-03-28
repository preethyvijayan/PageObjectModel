package com.obsqura.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.obsqura.pages.ActionsPage;


import utilities.ExcelUtility;
import utilities.PageUtility;

public class ActionsTest extends Base{
	ActionsPage actionspage;
	PageUtility pageutitlity;
	@Test
	public void checkactionClick() throws IOException
	{
		
		String value=ExcelUtility.getString(0, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\testdata.xlsx", "SingleInputData");
		actionspage=new ActionsPage(driver);
		pageutitlity.enterText(actionspage.singleInputfieldElement(), value);
		pageutitlity.actionClick(actionspage.showMessagebuttonElement(), driver);
	}
	@Test
	public void checkclickAndHold()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		actionspage=new ActionsPage(driver);
		pageutitlity.clickAndHoldOnElement(actionspage.selectAllButonElement(), driver);
	}
	@Test
	public void checkmouseHover()
	{
		actionspage=new ActionsPage(driver);
		pageutitlity.mouseHover(actionspage.simplformDemoElement(), driver);
	}
	@Test
	public void checkdoubleClick()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		actionspage=new ActionsPage(driver);
		pageutitlity.doubleClick(actionspage.selectAllButonElement(), driver);
	}
	@Test
	public void checkrightClick()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		actionspage=new ActionsPage(driver);
		pageutitlity.rightClick(actionspage.selectAllButonElement(), driver);
	}
	@Test
	public void checkdragAnddrop()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		actionspage=new ActionsPage(driver);
		pageutitlity.dragAnddrop(actionspage.dragableItemElement(), actionspage.dropItemElement(), driver);
		}
	
	
	
}
