package com.seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.xpath("//div[@id='tab1_tableGainer']/table/tbody/tr"));
		int rowSize = row.size();
		List<WebElement> col = driver.findElements(By.xpath("//div[@id='tab1_tableGainer']/table/tbody/tr[1]/td"));
		int colSize = col.size();
		System.out.println(colSize);
		System.out.println(rowSize);
		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {
				System.out.print(driver.findElement(
						By.xpath("//div[@id='tab1_tableGainer']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText()+"     ");
			}
			System.out.println();

		}

	}

}
