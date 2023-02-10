package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));


		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
