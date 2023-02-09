package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().window().maximize();
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement drag= driver.findElement(By.xpath("//h5[contains(text(),'High Tatras 3')]"));
		WebElement drop= driver.findElement(By.id("trash"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();

	}

}
