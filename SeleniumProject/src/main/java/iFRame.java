import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFRame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement frameOne = driver.findElement(By.id("sampleHeading"));
		Actions action = new Actions(driver);
		action.contextClick(frameOne).perform();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement frameTwo = driver.findElement(By.id("sampleHeading"));
		action.contextClick(frameTwo).build().perform();
		System.out.println(frameTwo.getText());

	}

}
