package academy.teenfuture.crse.Utility;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Base64;
import java.util.Locale;
import java.util.Random;

import org.junit.jupiter.api.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayWrightTests {

	int width = 1280;
	int height = 720;

	@Test
	// @Disabled
	public void Exercise1() throws InterruptedException {

		System.setProperty("java.awt.headless", "false");

		// Define the path to the project directory and create a timestamped file name
		// for the video
		String pathProject = System.getProperty("user.dir");
		LocalDateTime currentDateTime1 = LocalDateTime.now();
		String dateTimeSString1 = currentDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String testName = "video_" + dateTimeSString1;

		// Extent reports
		ExtentReports extent = new ExtentReports();
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeSString = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String path = System.getProperty("user.dir") + "/testresult/Exercise_1/index-" + dateTimeSString + ".html";

		// Create a new Extent Spark Reporter and configure it
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Testing Report");
		spark.config().setReportName("Extent Report Sample");
		extent.attachReporter(spark);

		// Test case to pass
		ExtentTest test = extent.createTest("To test the basic function");

		// Start Playwright =================
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize(width, height)
						.setRecordVideoDir(Paths.get("video/Exercise_1/")).setRecordVideoSize(width, height));
		Page page = browserContext.newPage();
		page.navigate("https://www.userflow.com/demo");

		// Use frameLocator() to interact with elements inside the iframe
		FrameLocator frame = page.frameLocator("#hs-form-iframe-0"); // Locate the iframe

		// Wait for the email input field inside the iframe
		Locator email = frame.locator("#email-6bad05fa-e723-4982-8620-6b7ea61c7286");
		email.scrollIntoViewIfNeeded();
		email.type("test_email@testemail.com", new Locator.TypeOptions().setDelay(250));

		Locator users = frame.locator("//input[@type='number']");
		users.scrollIntoViewIfNeeded();
		users.type("11", new Locator.TypeOptions().setDelay(250));

		Locator place = frame.locator("//input[@inputmode='text']");
		place.scrollIntoViewIfNeeded();
		place.type("Earth", new Locator.TypeOptions().setDelay(250));

		Locator message = frame.locator("//textarea[@class='hs-input hs-fieldtype-textarea']");
		message.scrollIntoViewIfNeeded();
		message.type("iframe is so interesting", new Locator.TypeOptions().setDelay(250));

		// Taking Screenshot
		byte[] screenshot = page.screenshot();
		String base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Basic Function testing",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		Thread.sleep(8000);

		// Close Playwright =================
		// Retrieve the name of the video file created by the recording
		Path videoName = page.video().path().getFileName();
		System.out.println("videoName : " + videoName);

		extent.flush();
		browserContext.close();
		page.close();
		playwright.close();

		// Locate the original video file and rename it with the timestamped file name
		File file1 = new File(pathProject + File.separator + "video" + File.separator + videoName);
		// new file
		File file2 = new File(pathProject + File.separator + "Exercise_2_video" + File.separator + testName + ".webm");
		file1.renameTo(file2);
	}

	@Test
	// @Disabled
	public void Exercise2() throws InterruptedException {
		// Extent reports
		ExtentReports extent = new ExtentReports();
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeSString = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String path = System.getProperty("user.dir") + "/testresult/Exercise_2/index-" + dateTimeSString + ".html";

		// Create a new Extent Spark Reporter and configure it
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Testing Report");
		spark.config().setReportName("Extent Report Sample");
		extent.attachReporter(spark);

		// Test case to pass
		ExtentTest test_1 = extent.createTest("Contact Number Error");
		ExtentTest test_2 = extent.createTest("Email Address Error");
		ExtentTest test_3 = extent.createTest("Contact Number and Email Address Error");
		ExtentTest test_4 = extent.createTest("Correct Full Name Input");
		ExtentTest test_5 = extent.createTest("Correct Contact Number Input");
		ExtentTest test_6 = extent.createTest("Correct Email Address Input");
		ExtentTest test_7 = extent.createTest("Correct Address Input");
		ExtentTest test_8 = extent.createTest("Correct Date Input");
		ExtentTest test_9 = extent.createTest("Correct Date Input");
		ExtentTest test_10 = extent.createTest("Correct Message Input");
		ExtentTest test_11 = extent.createTest("Correct YES NO button");
		ExtentTest test_12 = extent.createTest("Correct Submit button");

		System.setProperty("java.awt.headless", "false");

		// Define the path to the project directory and create a timestamped file name
		// for the video
		String pathProject = System.getProperty("user.dir");
		LocalDateTime currentDateTime1 = LocalDateTime.now();
		String dateTimeSString1 = currentDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String testName = "video_" + dateTimeSString1;

		// Start Playwright =================
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize(width, height)
						.setRecordVideoDir(Paths.get("video/Exercise_2/")).setRecordVideoSize(width, height));
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

			// Taking Screenshot
			byte[] screenshot = page.screenshot();
			String base64Image = Base64.getEncoder().encodeToString(screenshot);

			if (Contact_Number_Error.count() == 0) {

				test_1.fail("The invalid message in not shown",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

				throw new Exception("ERROR: Contact Number invalid error message element not found.");

			}

			System.out.println("Contact Number invalid error is detected");
			System.out.println("The message is \"" + Contact_Number_Error.textContent() + "\"");
			test_1.pass("The invalid message in shown",
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

			// Taking Screenshot
			byte[] screenshot = page.screenshot();
			String base64Image = Base64.getEncoder().encodeToString(screenshot);

			if (Email_Address_Error.count() == 0) {

				test_2.fail("The invalid message in not shown",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

				throw new Exception("ERROR:Email Address invalid error message element not found.");

			}

			System.out.println("Contact Number invalid error is detected");
			System.out.println("The message is \"" + Email_Address_Error.textContent() + "\"");
			test_2.pass("The invalid message in shown",
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

			// Taking Screenshot
			byte[] screenshot = page.screenshot();
			String base64Image = Base64.getEncoder().encodeToString(screenshot);

			if (Email_Address_Error.count() == 0 && Contact_Number_Error.count() == 0) {

				test_1.fail("Both invalid message in shown",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

				throw new Exception("ERROR:Email Address and Contact Number invalid error message element not found.");

			} else if (Contact_Number_Error.count() == 0) {

				test_1.fail("Contact Number invalid message in shown",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

				throw new Exception("ERROR: Contact Number invalid error message element not found.");

			} else if (Email_Address_Error.count() == 0) {

				test_1.fail("Email Address Error invalid message in shown",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

				throw new Exception("ERROR:Email Address invalid error message element not found.");

			}

			System.out.println("Contact Number and Email Address invalid error is detected");
			System.out.println("The message is \"" + Email_Address_Error.textContent() + "\" and \""
					+ Contact_Number_Error.textContent() + "\"");
			test_3.pass("The invalid message in shown",
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

		// Taking Screenshot
		byte[] screenshot = page.screenshot();
		String base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_4.pass("Correct Full Name Input",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		// Filling Contact Number
		Contact_Number.scrollIntoViewIfNeeded();
		Contact_Number.type("1234567890", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_5.pass("Correct Contact Number Input",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		// Filling Email Adress
		Email_Address.scrollIntoViewIfNeeded();
		Email_Address.type("example@example.com", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_6.pass("Correct Email Address Input",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_7.pass("Correct Address Input",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_8.pass("Correct Date Input", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_9.pass("Correct Date Input", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		// Input some services
		Service.scrollIntoViewIfNeeded();
		Service.type("A lot of service is needed.", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_10.pass("Correct Message Input",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

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

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_11.pass("Correct Yes No button",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		// Submit button
		Submit.scrollIntoViewIfNeeded();
		Submit.click();

		Thread.sleep(2000);

		// Taking Screenshot
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test_12.pass("Correct Submit button",
				MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		// Close Playwright =================
		// Retrieve the name of the video file created by the recording
		Path videoName = page.video().path().getFileName();
		System.out.println("videoName : " + videoName);

		extent.flush();
		browserContext.close();
		page.close();
		playwright.close();

		// Locate the original video file and rename it with the timestamped file name
		File file1 = new File(pathProject + File.separator + "video" + File.separator + videoName);
		// new file
		File file2 = new File(pathProject + File.separator + "Exercise_2_video" + File.separator + testName + ".webm");
		file1.renameTo(file2);
	}

	@Test
	// @Disabled
	public void Exercise3() throws InterruptedException {
		// Extent reports
		ExtentReports extent = new ExtentReports();
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeSString = currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String path = System.getProperty("user.dir") + "/testresult/Exercise_3/index-" + dateTimeSString + ".html";

		// Create a new Extent Spark Reporter and configure it
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Testing Report");
		spark.config().setReportName("Extent Report Sample");
		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Exercise 3 Test");

		System.setProperty("java.awt.headless", "false");

		// Define the path to the project directory and create a timestamped file name
		// for the video
		String pathProject = System.getProperty("user.dir");
		LocalDateTime currentDateTime1 = LocalDateTime.now();
		String dateTimeSString1 = currentDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		String testName = "video_" + dateTimeSString1;

		// Start Playwright =================
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser
				.newContext(new Browser.NewContextOptions().setViewportSize(width, height)
						.setRecordVideoDir(Paths.get("video/Exercise_3/")).setRecordVideoSize(width, height));
		Page page = browserContext.newPage();

		page.navigate(
				"https://www.jotform.com/form-templates/preview/21024070073437/classic&nofs&defer=false&disableSmartEmbed=1");

		Locator First_Name = page.locator("(//input[@class='form-textbox'])[1]");
		Locator Last_Name = page.locator("(//input[@class='form-textbox'])[2]");
		Locator Email = page.locator("//input[@class='form-textbox validate[Email]']");
		Locator Department = page.locator("(//input[@class='form-textbox'])[3]");
		Locator Computer_ID = page.locator("(//input[@data-component='textbox'])[2]");
		Locator Problem = page.locator("#input_6");
		Locator Button = page.locator("#input_2");

		First_Name.scrollIntoViewIfNeeded();
		First_Name.type("Chris", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		byte[] screenshot = page.screenshot();
		String base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("First Name is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		Last_Name.scrollIntoViewIfNeeded();
		Last_Name.type("Wong", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Last Name is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		Email.scrollIntoViewIfNeeded();
		Email.type("example@example.com", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Email is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		Department.scrollIntoViewIfNeeded();
		Department.type("Quality Assurance", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Department is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		Computer_ID.scrollIntoViewIfNeeded();
		Computer_ID.type("202410302117", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Computer ID is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		try {

			FileChooser fileChooser = page.waitForFileChooser(() -> page.click("#input_7"));
			Problem.scrollIntoViewIfNeeded();

			Thread.sleep(3000);
			fileChooser.setFiles(Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\sample.pdf"));
			fileChooser.setFiles(Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\sample1.pdf"));
			fileChooser.setFiles(Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\sample2.pdf"));

			while (true) {
				String progressText = page.locator("//ul[@aria-label='Uploaded files']").innerText();
				if (!progressText.contains("Cancel")) {
					break;
				}
				page.waitForTimeout(100);
			}

			Thread.sleep(1000);

			if (page.locator(
					"//span[normalize-space(text())='File upload failed, please remove it and upload the file again.']")
					.count() != 0) {
				System.out.println("test");
				throw new Exception("Upload Failed");
			}

			screenshot = page.screenshot();
			base64Image = Base64.getEncoder().encodeToString(screenshot);
			test.pass("Upload File success",
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		} catch (Exception e) {

			screenshot = page.screenshot();
			base64Image = Base64.getEncoder().encodeToString(screenshot);
			test.fail("Upload File fail", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

			System.out.println(e.getMessage());

		} finally {

			Thread.sleep(1000);

		}

		Problem.scrollIntoViewIfNeeded();
		Problem.type("1234567", new Locator.TypeOptions().setDelay(250));
		Thread.sleep(250);
		screenshot = page.screenshot();
		base64Image = Base64.getEncoder().encodeToString(screenshot);
		test.pass("Problem is shown", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

		try {

			Button.scrollIntoViewIfNeeded();
			Button.click();

			Thread.sleep(5000);

			String currentURL = page.url();

			if (currentURL.startsWith("https://www.jotform.com/form-templates/preview/thank-you/classic")) {

				System.out.println("Navigation successful!");
				screenshot = page.screenshot();
				base64Image = Base64.getEncoder().encodeToString(screenshot);
				test.pass("Nagvigation success",
						MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());

			} else {

				System.out.println("Navigation failed. Current URL: " + currentURL);
				throw new Exception("Navigation Failed");

			}

		} catch (Exception e) {

			screenshot = page.screenshot();
			base64Image = Base64.getEncoder().encodeToString(screenshot);
			test.fail("Navigation is falied",
					MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());
			System.out.println(e.getMessage());

		} finally {

			Thread.sleep(2000);

		}

		// Close Playwright =================
		Path videoName = page.video().path().getFileName();
		System.out.println("videoName : " + videoName);

		extent.flush();
		browserContext.close();
		page.close();
		playwright.close();

		// Locate the original video file and rename it with the timestamped file name
		File file1 = new File(pathProject + File.separator + "video" + File.separator + videoName);
		// new file
		File file2 = new File(pathProject + File.separator + "Exercise_2_video" + File.separator + testName + ".webm");
		file1.renameTo(file2);

	}

	private static LocalDate GetRandomDate() {
		LocalDate today = LocalDate.now();

		Random random = new Random();
		LocalDate date = today.plusDays(random.nextInt(7, 60));

		return date;

	}

}
