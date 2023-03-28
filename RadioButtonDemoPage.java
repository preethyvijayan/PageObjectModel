package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;
import utilities.WaitUtility;

public class RadioButtonDemoPage {
	public WebDriver driver;
	public RadioButtonDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By maleRadiobutton=By.xpath("//input[@id='inlineRadio1']");
	By femaleRadiobutton=By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValuebutton=By.xpath("//button[@id='button-one']");
	By displayResult=By.xpath("//div[@id='message-one']");
	public WebElement maleRadiobuttonElement()
	{
		WebElement maleRadiobuttonelement=driver.findElement(maleRadiobutton);
		return maleRadiobuttonelement;
	}
	public WebElement femaleRadiobuttonElement()
	{
		WebElement femaleRadiobuttonelement=driver.findElement(femaleRadiobutton);
		return femaleRadiobuttonelement;
	}
	public WebElement showSelectedValuebuttonElement()
	{
		WebElement showSelectedValuebuttonelement=driver.findElement(showSelectedValuebutton);
		return showSelectedValuebuttonelement;
	}
	public WebElement displayResultElement()
	{
		WebElement displayResultelement=driver.findElement(displayResult);
		return displayResultelement;
	}
	public boolean maleRadiobuttonElementisEnabled()
	{
		return maleRadiobuttonElement().isEnabled();
	}
	public boolean femaleRadiobuttonElementisEnabled()
	{
		return femaleRadiobuttonElement().isEnabled();
	}
	public void toclickRadiobutton()
	{
		WaitUtility.fluentwaitForElementSelected(driver, femaleRadiobutton);
		PageUtility.clickOnElement(femaleRadiobuttonElement());
	}
	public boolean femaleRadiobuttonElementisSelected()
	{
		return PageUtility.elementIsSelected(femaleRadiobuttonElement());
	}
	public void toClickshowSelectedValuebutton()
	{
		WaitUtility.fluentwaitForElementClickable(driver, showSelectedValuebutton);
		PageUtility.clickOnElement(showSelectedValuebuttonElement());
	}
	public String toDisplaymessage()
	{
		String output=PageUtility.getElementText(displayResultElement());
		return output;
	}

}
