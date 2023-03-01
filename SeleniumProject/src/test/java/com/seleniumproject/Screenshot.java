package com.seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[]args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testng.org/doc/");
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
TakesScreenshot screenshot=(TakesScreenshot)driver;
File file= screenshot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("./src/test/resources/Screenshot/screen100.png"));
	
	}
}
