package academy.teenfuture.crse.Utility;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTests {
	// Set up of Firefox
	@Disabled
	@Test
	public void getStart_Firefox() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\FirefoxDriver\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		WebDriver driver = new FirefoxDriver(options);
		// WevDriver driver = new FirefoxDriver(); //for default setting
		driver.get("https://www.google.com.hk");
		driver.close();
	}

	@Test
	@Disabled
	public void ScrollUsingJavascriptCode() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\Driver\\FirefoxDriver\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		WebDriver driver = new FirefoxDriver(options);
		// WevDriver driver = new FirefoxDriver(); //for default setting
		driver.get(
				"https://www.jotform.com/form-templates/preview/31362999175971/classic&nofs&defer=false&disableSmartEmbed=1");

		Thread.sleep(7000); // Make all element loaded first

		WebElement First_Name = driver.findElement(By.xpath("//input[@data-component='first']"));
		WebElement Last_Name = driver.findElement(By.xpath("//input[@data-component='last']"));
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement Message = driver.findElement(By.xpath("//textarea[@data-component='textarea']"));
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));

		First_Name.sendKeys("Chris");
		Last_Name.sendKeys("Wong");
		Email.sendKeys("example@example.com");
		Message.sendKeys("I am a message");

		Thread.sleep(5000);

		// This method is used if the normal interaction is not available
		// JavascriptExecutor is to execute JavaScript code in the html
		// finding the first button pass the argument
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Button);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click(true);", Button);

		// Button.click(); //This is not work

		Thread.sleep(5000);

		driver.close();
	}

}
