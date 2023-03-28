package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SingleCheckboxDemoPage {
	WebDriver driver;
	public SingleCheckboxDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By singleCheckboxDemo=By.xpath("//input[@id='gridCheck']");
	By displaymessageResult=By.xpath("//div[@id='message-one']");
	public WebElement singleCheckboxDemoElement()
	{
		WebElement singleCheckboxDemoelement=driver.findElement(singleCheckboxDemo);
		return singleCheckboxDemoelement;
	}
	public WebElement displayMessageElement()
	{
		WebElement displaymessageelement =driver.findElement(displaymessageResult);
		return displaymessageelement;
	}
	public boolean singleCheckboxDemoElementisEnabled()
	{
		return PageUtility.elementIsEnabled(singleCheckboxDemoElement());
		
	}
	public void toClickSinglecheckbox()
	{
		WaitUtility.fluentwaitForElementClickable(driver, singleCheckboxDemo);
		PageUtility.getClickElement(singleCheckboxDemoElement());
	}
	
	public String toDisplayMessage()
	{
		PageUtility.isElementDisplayed(displayMessageElement());
		String output=PageUtility.getElementText(displayMessageElement());
		return output;
	}
	public boolean toDisplatmessageisDisplayed()
	{
		return PageUtility.isElementDisplayed(displayMessageElement());
		
	}
	

}
