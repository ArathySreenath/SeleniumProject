package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions action =new Actions(driver);
		WebElement clickOnHome = driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
		action.moveToElement(clickOnHome).perform();
		driver.findElement(By.linkText("Home Furnishings")).click();
		WebElement login=driver.findElement(By.linkText("Login"));
		action.contextClick(login).build().perform();

	}

}

