package academy.teenfuture.crse.Utility;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumTests {
//	@BeforeEach
//	static void beforeEach() {
//
//		/*
//		 * try { ScreenRecorderUtil.deleteRecords(); } catch(Exception e) {
//		 * System.out.println("No previous records: " + e); }
//		 */
//		try {
//			ScreenRecorderUtil.startRecord("testRecord");
//		} catch (Exception e) {
//			System.out.println("startRecord err. in: " + e);
//		}
//	}
//
//	@AfterEach
//	static void afterEach() {
//		try {
//			ScreenRecorderUtil.stopRecord();
//		} catch (Exception e) {
//			System.out.println("afterAll err. in: " + e);
//		}
//	}

	@Test
	// @Disabled
	public void Exercise1() throws InterruptedException {

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

		HumanTypeMethod(First_Name, "Chris"); // First Name
		HumanTypeMethod(Last_Name, "Wong"); // Last Name
		HumanTypeMethod(Email, "example@example.com"); // Email
		HumanTypeMethod(Message, "I am a message"); // Message

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

	public static void HumanTypeMethod(WebElement webelement, String string) throws InterruptedException {
		Random rnd = new Random();
		for (int i = 0; i < string.length(); i++) {
			webelement.sendKeys(String.valueOf(string.charAt(i)));
			Thread.sleep(500 + rnd.nextInt(201));
		}
	}

}
