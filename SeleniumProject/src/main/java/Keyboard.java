import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement copyText=	driver.findElement(By.xpath("//textarea[@id='editor-container-text']//parent::div//child::div[@class='CodeMirror cm-s-default']"));
		Actions action=new Actions(driver);
		action.keyDown(copyText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement pasteArea=	driver.findElement(By.xpath("//textarea[@id='editor-container-text-2']//following-sibling::div[@class='CodeMirror cm-s-default']"));
		action.keyDown(pasteArea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}
