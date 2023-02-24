package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String expectedTitle = "Register";

		Assert.assertEquals(title, expectedTitle, "Failed");

		Boolean check = driver.findElement(By.cssSelector("input[value='Cricket']")).isSelected();
		Assert.assertFalse(check, "checked");

		driver.findElement(By.cssSelector("input[value='Cricket']")).click();
		Boolean checkSelect = driver.findElement(By.cssSelector("input[value='Cricket']")).isSelected();
		Assert.assertTrue(checkSelect);

		driver.findElement(By.linkText("WebTable")).click();
		String WebtableUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demo.automationtesting.in/Register.html";
		Assert.assertNotEquals(WebtableUrl, expectedUrl);
		
		

	}

}
