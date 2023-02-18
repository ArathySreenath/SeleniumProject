import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> colCount=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(colCount.size());
		List<WebElement> rowCount=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(rowCount.size());
		String companyName;
		for(int i=1;i<=rowCount.size();i++)
		{
			WebElement companyNameElement=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]"));
companyName=companyNameElement.getText();


if(companyName.equals("Bata India"))
{
System.out.println(companyName);
System.out.println("Current price "+driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[4]")).getText());
break;
}

}
		
	}

}
