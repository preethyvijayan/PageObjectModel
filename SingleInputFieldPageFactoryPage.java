package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SingleInputFieldPageFactoryPage {
	public WebDriver driver;
	public SingleInputFieldPageFactoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='single-input-field']") WebElement singleInputfieldElement;
	@FindBy(xpath="//button[@id='button-one']") WebElement showmessagebuttonelement;
	@FindBy(xpath="//div[@id='message-one']") WebElement displayMessageElement;
	public void enterDatainInputfieldForm(String input)
	{
		PageUtility.enterText(singleInputfieldElement, input);
	}
	public void clickOnShowMessageButton()
	{
		WaitUtility.fluentwaitForElementClickable(driver, showmessagebuttonelement);
		PageUtility.getClickElement(showmessagebuttonelement);
	}
	public String simpleInputfieldGettext()
	{
		String outputText=PageUtility.getElementText(displayMessageElement);
		return outputText;
	
	}
}
