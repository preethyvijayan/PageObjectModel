package com.obsqura.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
	WaitUtility waitutility=new WaitUtility();
	@BeforeMethod(alwaysRun = true)
	public void initiliseBrowser()
	{
		//System.setProperty("webdriver.edge.driver", "E:\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\Resource\\msedgedriver.exe");
		//driver = new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\Resources\\chromedriver.exe");
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		waitutility.pageLoadTimeout(driver);
		//driver.get("https://www.google.com/");
	
	}
	@AfterMethod(alwaysRun= true)
	public void toQuit()
	{
		driver.quit();
	}

}
