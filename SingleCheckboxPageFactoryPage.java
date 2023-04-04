package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SingleCheckboxPageFactoryPage {
	public WebDriver driver;
	public SingleCheckboxPageFactoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By singleCheckbox=By.xpath("//input[@id='gridCheck']");
	@FindBy(xpath="//input[@id='gridCheck']") WebElement singleCheckboxDemoelement;
	@FindBy(xpath="//div[@id='message-one']") WebElement displaymessageelement;
	
	public boolean singleCheckboxDemoElementisEnabled()
	{
		return PageUtility.elementIsEnabled(singleCheckboxDemoelement);
		
	}
	public void toClickSinglecheckbox()
	{
		WaitUtility.fluentwaitForElementClickable(driver,singleCheckbox );
		PageUtility.getClickElement(singleCheckboxDemoelement);
	}
	
	public String toDisplayMessage()
	{
		PageUtility.isElementDisplayed(displaymessageelement);
		String output=PageUtility.getElementText(displaymessageelement);
		return output;
	}
	public boolean toDisplatmessageisDisplayed()
	{
		return PageUtility.isElementDisplayed(displaymessageelement);
		
	}
	
}
