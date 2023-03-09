package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleInputformDemoPage {
	public WebDriver driver;
	public SimpleInputformDemoPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By singleInputfield=By.xpath("//input[@id='single-input-field']");//to locate the element
	By showMessagebutton=By.xpath("//button[@id='button-one']");
	By displayMessage=By.xpath("//div[@id='message-one']");
	public WebElement singleInputfieldElement()
	{
		WebElement singleInputfieldelement=driver.findElement(singleInputfield);
		return singleInputfieldelement;
	}
	public WebElement showMessagebuttonElement()
	{
		WebElement showmessagebuttonelement=driver.findElement(showMessagebutton);
		return showmessagebuttonelement;
	}
	public WebElement displayMessageElement()
	{
		WebElement displayMessageElement=driver.findElement(displayMessage);
		return displayMessageElement;
	}
	
	public void enterDatainInputfieldForm(String input)
	{
		singleInputfieldElement().sendKeys(input);
	}
	public void clickOnShowMessageButton()
	{
		showMessagebuttonElement().click();
	}
	public String simpleInputfieldGettext(String outputText)
	{
		outputText=displayMessageElement().getText();
		return outputText;
	
	}

}
