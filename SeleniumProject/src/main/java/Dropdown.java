import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skills=driver.findElement(By.id("Skills"));
		Select dropdown=new Select(skills);
		dropdown.selectByIndex(1);
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));
		dropdown.selectByValue("Android");
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));
		dropdown.selectByVisibleText("Analytics");
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));


	}

}
