import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Parvathy");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S");
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//child::textarea")).sendKeys("address address address address");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parvathy@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9891258963");

		List<WebElement> radioGender = driver.findElements(By.xpath("//input[@type='radio']"));
		int sizeOfRadio = radioGender.size();
		for (int i = 0; i < sizeOfRadio; i++) {
			String valueOfGender = radioGender.get(i).getAttribute("value");
			if (valueOfGender.equalsIgnoreCase("FeMale")) {
				radioGender.get(i).click();
				break;
			}
		}

		List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int sizeOfCheck = hobbies.size();
		for (int i = 0; i < sizeOfCheck; i++) {
			String valueOfHobbies = hobbies.get(i).getAttribute("value");
			if (valueOfHobbies.equalsIgnoreCase("Movies")) {
				hobbies.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
		List<WebElement> languageSelect=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li//a"));
int sizeOf=languageSelect.size();
for(WebElement l:languageSelect)
{
	String selectLang=l.getText();
if(selectLang.equalsIgnoreCase("English"))	
{
	System.out.println("English");
//WebDriverWait waitForLang=new WebDriverWait(driver,Duration.ofSeconds(60));
//waitForLang.until(ExpectedConditions.elementToBeClickable(l));
	
	Actions action=new Actions(driver);
	action.moveToElement(l).click().perform();
//l.click();

break;
}
}
		WebElement skill = driver.findElement(By.id("Skills"));
		Select skillset = new Select(skill);
		skillset.selectByValue("Android");

//		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
//	driver.findElement(By.className("select2-search__field")).sendKeys("India");
//		WebElement country = driver.findElement(By.id("select2-country-container"));
//		Select countries = new Select(country);
//		countries.selectByValue("India");
		WebElement year = driver.findElement(By.id("yearbox"));
		Select yearSelect = new Select(year);
		yearSelect.selectByValue("1993");

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select monthSelect = new Select(month);
		monthSelect.selectByValue("January");

		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select daySelect = new Select(day);
		daySelect.selectByValue("3");

		driver.findElement(By.id("firstpassword")).sendKeys("Password@123");
		driver.findElement(By.id("secondpassword")).sendKeys("Password@123");
		driver.findElement(By.id("submitbtn")).click();

	}

}
