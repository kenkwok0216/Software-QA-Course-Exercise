package academy.teenfuture.crse.Utility;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightTests {

	@Test
	@Disabled
	public void Exercise1() throws InterruptedException {

		// Start Playwright =================
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.firefox();
		Page page = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false)).newContext().newPage();
		page.navigate("https://www.userflow.com/demo");

		// Use frameLocator() to interact with elements inside the iframe
		FrameLocator frame = page.frameLocator("#hs-form-iframe-0"); // Locate the iframe

		// Wait for the email input field inside the iframe
		Locator email = frame.locator("#email-6bad05fa-e723-4982-8620-6b7ea61c7286");
		email.scrollIntoViewIfNeeded();
		email.fill("test_email@testemail.com");

		Locator users = frame.locator("//input[@type='number']");
		users.scrollIntoViewIfNeeded();
		users.fill("11");

		Locator place = frame.locator("//input[@inputmode='text']");
		place.scrollIntoViewIfNeeded();
		place.fill("Earth");

		Locator message = frame.locator("//textarea[@class='hs-input hs-fieldtype-textarea']");
		message.scrollIntoViewIfNeeded();
		message.fill("iframe is so interesting");

		Thread.sleep(8000);

		// Close Playwright =================
		playwright.close();
	}

	@Test
	public void Exercise2() throws InterruptedException {
		// Video code
		System.setProperty("java.awt.headless", "false");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = dimension.width;
		int height = dimension.height;

		// Define the path to the project directory and create a timestamped file name
		// for the video
		String pathProject = System.getProperty("user.dir");
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeSString = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String testName = "video_" + dateTimeSString;

		// Start Playwright =================
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize(width, height)
						.setRecordVideoDir(Paths.get("video/")).setRecordVideoSize(width, height));
		Page page = browserContext.newPage();
		page.navigate(
				"https://www.jotform.com/form-templates/preview/221092671845054/classic&nofs&defer=false&disableSmartEmbed=1");

		// Locate Element
		// Full Name
		Locator First_Name = page.locator("(//input[@class='form-textbox'])[1]");
		Locator Last_Name = page.locator("(//input[@class='form-textbox'])[2]");

		// Contact Number and Email Address
		Locator Contact_Number = page.locator("(//input[@type='tel'])[1]");
		Locator Email_Address = page.locator("//input[@data-component='email']");

		// Address
		Locator Address_Street_1 = page.locator("(//input[@class='form-textbox form-address-line'])[1]");
		Locator Address_Street_2 = page.locator("(//input[@class='form-textbox form-address-line'])[2]");
		Locator Address_City = page.locator("//input[@class='form-textbox form-address-city']");
		Locator Address_State = page.locator("//input[@class='form-textbox form-address-state']");
		Locator Address_Zip = page.locator("//input[@class='form-textbox form-address-postal']");

		// What date and time work best for you
		// This should be manage in run time

		// Any other specific date and time, if the above selection is not suitable.
		Locator Not_Date = page.locator("//input[@data-format='mmddyyyy']");
		Locator Not_Time = page.locator("//input[@data-mask='hh:MM']");
		Locator Not_AM_PM = page.locator("//select[@data-component='time-ampm']");

		// What services are you interested in?
		Locator Service = page.locator("//textarea[@aria-labelledby='label_10']");

		// Would you like to be notified about promotional services?
		Locator Yes_No = page.locator("//div[@aria-labelledby='label_11']");

		// Submit Button
		Locator Submit = page.locator("//button[@type='submit']");

		// We start with Error Handling First
		System.out.println("--------- Error Handling ---------");

		// Contact Number is not valid
		// Email Address is valid
		try {

			System.out.println("======= Contact Number Error =======");
			Thread.sleep(250);
			Contact_Number.type("333", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Email_Address.type("example@example.com", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Contact_Number.press("End"); // This line is for activate the error message

			Thread.sleep(1000); // This line is waiting the error message

			Locator Contact_Number_Error = page.locator("(//span[@class='error-navigation-message'])[1]");

			if (Contact_Number_Error.count() == 0) {

				throw new Exception("ERROR: Contact Number invalid error message element not found.");

			}

			System.out.println("Contact Number invalid error is detected");
			System.out.println("The message is \"" + Contact_Number_Error.textContent() + "\"");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			Thread.sleep(250);
			int length_1 = Contact_Number.inputValue().length();

			for (int i = 0; i < length_1; i++) {
				Contact_Number.press("Backspace");
				Thread.sleep(250);
			}

			Thread.sleep(250);

			int length_2 = Email_Address.inputValue().length();
			for (int i = 0; i < length_2; i++) {
				Email_Address.press("Backspace");
				Thread.sleep(250);
			}

			System.out.println("======= End of Contact Number Error =======\n");

		}

		// Contact Number is valid
		// Email Address is not valid
		try {

			System.out.println("======= Email Address Error =======");
			Thread.sleep(250);
			Contact_Number.type("1234567890", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Email_Address.type("example", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Contact_Number.press("End"); // This line is for activate the error message

			Thread.sleep(1000); // This line is waiting the error message

			Locator Email_Address_Error = page.locator("(//span[@class='error-navigation-message'])[1]");

			if (Email_Address_Error.count() == 0) {

				throw new Exception("ERROR:Email Address invalid error message element not found.");

			}

			System.out.println("Contact Number invalid error is detected");
			System.out.println("The message is \"" + Email_Address_Error.textContent() + "\"");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			Thread.sleep(250);
			int length_1 = Contact_Number.inputValue().length();

			for (int i = 0; i < length_1; i++) {
				Contact_Number.press("Backspace");
				Thread.sleep(250);
			}

			Thread.sleep(250);

			int length_2 = Email_Address.inputValue().length();
			for (int i = 0; i < length_2; i++) {
				Email_Address.press("Backspace");
				Thread.sleep(250);
			}

			System.out.println("======= End of Email Address Error =======\n");

		}

		// Contact Number is not valid
		// Email Address is not valid
		try {

			System.out.println("======= Email Address and Contact Number Error =======");
			Thread.sleep(250);
			Contact_Number.type("123", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Email_Address.type("example", new Locator.TypeOptions().setDelay(250));
			Thread.sleep(250);
			Contact_Number.press("End"); // This line is for activate the error message

			Thread.sleep(1000); // This line is waiting the error message

			Locator Contact_Number_Error = page.locator("(//span[@class='error-navigation-message'])[1]");
			Locator Email_Address_Error = page.locator("(//span[@class='error-navigation-message'])[2]");

			if (Email_Address_Error.count() == 0 && Contact_Number_Error.count() == 0) {

				throw new Exception("ERROR:Email Address and Contact Number invalid error message element not found.");

			} else if (Contact_Number_Error.count() == 0) {

				throw new Exception("ERROR: Contact Number invalid error message element not found.");

			} else if (Email_Address_Error.count() == 0) {

				throw new Exception("ERROR:Email Address invalid error message element not found.");

			}

			System.out.println("Contact Number and Email Address invalid error is detected");
			System.out.println("The message is \"" + Email_Address_Error.textContent() + "\" and \""
					+ Contact_Number_Error.textContent() + "\"");

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			Thread.sleep(250);
			int length_1 = Contact_Number.inputValue().length();

			for (int i = 0; i < length_1; i++) {
				Contact_Number.press("Backspace");
				Thread.sleep(250);
			}

			Thread.sleep(250);

			int length_2 = Email_Address.inputValue().length();
			for (int i = 0; i < length_2; i++) {
				Email_Address.press("Backspace");
				Thread.sleep(250);
			}

			System.out.println("======= End of Email Address and Contact Number Error =======\n");

		}

		System.out.println("--------- End of Error Handling ---------\n");

		System.out.println("--------- Starting Normal Procedure ---------");

		// Filling Full Name
		Thread.sleep(250);
		First_Name.scrollIntoViewIfNeeded();
		First_Name.type("Chris", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Last_Name.scrollIntoViewIfNeeded();
		Last_Name.type("Wong", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Filling Contact Number
		Contact_Number.scrollIntoViewIfNeeded();
		Contact_Number.type("1234567890", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Filling Email Adress
		Email_Address.scrollIntoViewIfNeeded();
		Email_Address.type("example@example.com", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Fill Address
		Address_Street_1.scrollIntoViewIfNeeded();
		Address_Street_1.type("81 Tooraweenah Road", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Address_Street_2.scrollIntoViewIfNeeded();
		Address_Street_2.type("", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Address_City.scrollIntoViewIfNeeded();
		Address_City.type("Mugincoble", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Address_State.scrollIntoViewIfNeeded();
		Address_State.type("New South Wales", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Address_Zip.scrollIntoViewIfNeeded();
		Address_Zip.type("2870", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Handling Date 1
		// Get a Random date
		LocalDate date = LocalDate.now().plusDays(7);
		Thread.sleep(500);

		// Selecting Year
		Locator Best_Year = page.locator("//select[@data-name='year']");
		Thread.sleep(500);
		Best_Year.scrollIntoViewIfNeeded();
		Best_Year.selectOption(String.valueOf(date.getYear()));
		Thread.sleep(500);

		// Selecting Months
		Locator Best_Month = page.locator("//select[@data-name='month']");
		Thread.sleep(500);
		Best_Month.scrollIntoViewIfNeeded();
		Best_Month.selectOption(String.valueOf(date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)));
		Thread.sleep(500);

		// Selecting Day
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Locator Best_Day = page.locator("div.calendarDay[data-value='" + date.format(formatter) + "']");
		Best_Day.scrollIntoViewIfNeeded();
		Best_Day.click();

		Thread.sleep(500);
		// Go to Select the time Container
		Locator Best_Time_Page = page.locator("//div[@class='appointmentSlotsContainer']");
		Best_Time_Page.scrollIntoViewIfNeeded();
		// Find numbers of available time
		Locator Best_Time = Best_Time_Page.locator("//div[@class='appointmentSlot slot ']");
		int count = Best_Time.count();

		// Randomly Select a date to click
		// Note random.nextInt(x) is [0,x)
		Random random = new Random();
		Best_Time.nth(random.nextInt(count)).click();

		LocalDate Random_date = GetRandomDate();

		// It allows input for date
		Thread.sleep(500);
		Not_Date.scrollIntoViewIfNeeded();
		Not_Date.type(String.format("%02d", Random_date.getMonthValue()), new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Not_Date.type(String.format("%02d", Random_date.getDayOfMonth()), new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		Not_Date.type(String.valueOf(Random_date.getYear()), new Locator.TypeOptions().setDelay(250));
		Thread.sleep(500);

		// It allows input for the times
		Thread.sleep(500);
		Not_Time.scrollIntoViewIfNeeded();
		Not_Time.type(String.format("%02d", random.nextInt(13), new Locator.TypeOptions().setDelay(250)));
		Thread.sleep(250);
		Not_Time.type(String.format("%02d", random.nextInt(60), new Locator.TypeOptions().setDelay(250)));
		Thread.sleep(250);

		// Choosing AM PM
		Thread.sleep(500);
		Not_AM_PM.scrollIntoViewIfNeeded();
		Not_AM_PM.selectOption(random.nextInt(2) == 1 ? "AM" : "PM");
		Thread.sleep(250);

		// Input some services
		Service.scrollIntoViewIfNeeded();
		Service.type("A lot of service is needed.", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		Yes_No.scrollIntoViewIfNeeded();
		Locator YES = Yes_No.locator("//label[normalize-space(text())='Yes']");
		Locator NO = Yes_No.locator("//label[normalize-space(text())='No']");

		// This is a loop to test YES NO function (only one is selected)
		for (int i = 0; i < 10; i++) {
			YES.click();
			Thread.sleep(250);
			NO.click();
			Thread.sleep(250);
		}

		// Submit button
		Submit.scrollIntoViewIfNeeded();
		Submit.click();

		Thread.sleep(2000);

		// Close Playwright =================
		// Retrieve the name of the video file created by the recording
		Path videoName = page.video().path().getFileName();
		System.out.println("videoName : " + videoName);

		browserContext.close();
		page.close();
		playwright.close();

		// Locate the original video file and rename it with the timestamped file name
		File file1 = new File(pathProject + File.separator + "video" + File.separator + videoName);
		// new file
		File file2 = new File(pathProject + File.separator + "video" + File.separator + testName + ".webm");
		file1.renameTo(file2);
	}

	private static LocalDate GetRandomDate() {
		LocalDate today = LocalDate.now();

		Random random = new Random();
		LocalDate date = today.plusDays(random.nextInt(7, 60));

		return date;

	}

}
