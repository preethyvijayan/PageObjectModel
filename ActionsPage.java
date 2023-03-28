package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.PageUtility;

public class ActionsPage {
	public WebDriver driver;
	public ActionsPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By singleInputfield=By.xpath("//input[@id='single-input-field']");
	By showMessagebutton=By.xpath("//button[@id='button-one']");
	By selectAllButon=By.xpath("//input[@id='button-two']");
	By simplformDemo=By.xpath("//a[text()='Simple Form Demo']");
	By dragableItem=By.xpath("//span[text()='Draggable n°1']");
	By dropItem=By.xpath("//div[@id='mydropzone']");

	
	public WebElement singleInputfieldElement()
	{
		WebElement singleinputfieldelement=driver.findElement(singleInputfield);
		return singleinputfieldelement;
	}
	public WebElement showMessagebuttonElement()
	{
		WebElement showMessagebuttonelement=driver.findElement(showMessagebutton);
		return showMessagebuttonelement;
	}
	public WebElement selectAllButonElement()
	{
		WebElement selectallbutonelement=driver.findElement(selectAllButon);
		return selectallbutonelement;
	}
	public WebElement simplformDemoElement()
	{
		WebElement simplformdemoelement=driver.findElement(simplformDemo);
		return simplformdemoelement;
	}
	public WebElement dragableItemElement()
	{
		WebElement dragableItemelement=driver.findElement(dragableItem);
		return dragableItemelement;
	}
	public WebElement dropItemElement()
	{
		WebElement dropItemelement=driver.findElement(dropItem);
		return dropItemelement;
	}
	
	
	
}
