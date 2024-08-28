package com.JedEdgeDI.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_DI_3_FOSFileUpload {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check FOS File Upload User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check FOS File Upload User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check FOS File Upload")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.print("\u001B[1mLogin button clicked\u001B[0m");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}

	}

	@And("close the FOS File Upload Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in FOS File Upload")
	public void Check_Page_Landed_to_Homepage_or_not_in_PL_File_Upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("img1")));
		ele = driver.findElement(By.id("img1"));
		if (ele.isDisplayed()) {
			System.out.println("Page landed to home page");
		} else {
			System.out.println("Page doesnot landed to home page");
		}
	}

	@Then("Click Trip Time button in FOS File Upload")
	public void click_pl_file_upload_button_in_ns_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[2]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[2]/a/i"));
		ele1.click();
	}

	@And("click upload button in Trip Time")
	public void click_upload_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("click help button in Trip Time")
	public void click_help_button_in_trip_time() throws InterruptedException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnHelp")));
		ele = driver.findElement(By.id("btnHelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("click sample file button in Trip Time")
	public void click_sample_file_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkDownload")));
		ele = driver.findElement(By.id("lnkDownload"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("click view report button in Trip Time")
	public void click_view_report_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnViewFull")));
		ele = driver.findElement(By.id("btnViewFull"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click back button in view report page")
	public void click_back_button_in_view_report_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele = driver.findElement(By.id("btnBack"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click run button in view report page")
	public void click_run_button_in_view_report_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRun")));
		ele = driver.findElement(By.id("btnRun"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in view report page")
	public void select_valid_from_date_in_view_report_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_0_0")));
		ele1 = driver.findElement(By.id("CalendarExtender1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in view report page")
	public void select_valid_to_date_in_view_report_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender2_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender2_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Check table is displayed or not in view report page")
	public void check_table_is_displayed_or_not_in_view_report_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFosFile")));
		ele = driver.findElement(By.id("gvFosFile"));
		if (ele.isDisplayed()) {
			System.out.println("Webtable is displayed");
		} else {
			System.out.println("Webtable is not displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click choose file button and upload valid file in Trip Time")
	public void click_choose_file_button_and_upload_valid_file_in_trip_time()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click version2 radio button in Trip Time")
	public void click_version2_radio_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlVersion_0")));
		ele = driver.findElement(By.id("ddlVersion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in Trip Time")
	public void select_valid_from_date_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid to date in Trip Time")
	public void select_valid_to_date_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click clear button in Trip Time")
	public void click_clear_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Check data is cleared or not in Trip Time")
	public void check_data_is_cleared_or_not_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// From Date
		ele = driver.findElement(By.id("txtFromDate"));
		String FromDate = ele.getAttribute("value");
		if (FromDate.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}

		// To Date
		ele1 = driver.findElement(By.id("txtToDate"));
		String ToDate = ele.getAttribute("value");
		if (ToDate.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in Trip Time")
	public void click_version1_radio_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlVersion_1")));
		ele = driver.findElement(By.id("ddlVersion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click download button in Trip Time")
	public void click_download_button_in_trip_time() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click Future Trips button in FOS File Upload")
	public void click_future_trips_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[3]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[3]/a/i"));
		ele1.click();
	}

	@And("click help button in Future Trips")
	public void click_help_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnhelp")));
		ele = driver.findElement(By.id("btnhelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("click sample file button in Future Trips")
	public void click_sample_file_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkDownload")));
		ele = driver.findElement(By.id("lnkDownload"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("click view report button in Future Trips")
	public void click_view_report_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnViewFull")));
		ele = driver.findElement(By.id("btnViewFull"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click back button in Future Trips page")
	public void click_back_button_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele = driver.findElement(By.id("btnBack"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click run button in Future Trips page")
	public void click_run_button_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRun")));
		ele = driver.findElement(By.id("btnRun"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in Future Trips")
	public void select_valid_from_date_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtStartDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtStartDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in Future Trips")
	public void select_valid_to_date_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEndDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtEndDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender1_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	
	@Then("Select valid from date in view report in Future Trips")
	public void select_valid_from_date_in_view_report_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender2_day_0_0")));
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in view report in Future Trips")
	public void select_valid_to_date_in_view_report_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender3_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender3_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid from date in view report in Crew Trip Log")
	public void select_valid_from_date_in_view_report_in_Crew_Trip_Log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender2_day_0_0")));
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in view report in Crew Trip Log")
	public void select_valid_to_date_in_view_report_in_Crew_Trip_Log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtPToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender3_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender3_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	

	@And("Check table is displayed or not in Future Trips page")
	public void check_table_is_displayed_or_not_in_future_trips_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFosFile")));
		ele = driver.findElement(By.id("gvFosFile"));
		if (ele.isDisplayed()) {
			System.out.println("Webtable is displayed");
		} else {
			System.out.println("Webtable is not displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click choose file button and upload valid file in Future Trips")
	public void click_choose_file_button_and_upload_valid_file_in_future_trips()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@And("Click version3 radio button in Future Trips")
	public void click_version3_radio_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_0")));
		ele = driver.findElement(By.id("ddlversion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click daily radio button in Future Trips")
	public void click_daily_radio_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_0")));
		ele = driver.findElement(By.id("rblFileType_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in Future Trips")
	public void click_clear_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Check data is cleared or not in Future Trips")
	public void check_data_is_cleared_or_not_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtStartDate")));
		// From Date
		ele = driver.findElement(By.id("txtStartDate"));
		String FromDate = ele.getAttribute("value");
		if (FromDate.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}

		// To Date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEndDate")));
		ele1 = driver.findElement(By.id("txtEndDate"));
		String ToDate = ele1.getAttribute("value");
		if (ToDate.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}

		// Notes
		ele2 = driver.findElement(By.id("txtNotes"));
		String Notes = ele2.getAttribute("value");
		if (Notes.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}

		driver.switchTo().defaultContent();
	}

	@Then("Enter valid notes {string} in Future Trips")
	public void enter_valid_notes_in_future_trips(String Notes) {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.sendKeys(Notes);
		driver.switchTo().defaultContent();
	}

	@Then("Click hourly radio button in Future Trips")
	public void click_hourly_radio_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_1")));
		ele = driver.findElement(By.id("rblFileType_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click version2 radio button in Future Trips")
	public void click_version2_radio_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_1")));
		ele = driver.findElement(By.id("ddlversion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in Future Trips")
	public void click_version1_radio_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_2")));
		ele = driver.findElement(By.id("ddlversion_2"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click upload button in Future Trips")
	public void click_upload_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click download button in Future Trips")
	public void click_download_button_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click Crew Trip Log button in FOS File Upload")
	public void click_crew_trip_log_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[5]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[5]/a/i"));
		ele1.click();
	}

	@And("click help button in Crew Trip Log")
	public void click_help_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnHelp")));
		ele = driver.findElement(By.id("btnHelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("click sample file button in Crew Trip Log")
	public void click_sample_file_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkDownload")));
		ele = driver.findElement(By.id("lnkDownload"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("click view report button in Crew Trip Log")
	public void click_view_report_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnViewFull")));
		ele = driver.findElement(By.id("btnViewFull"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click back button in Crew Trip Log page")
	public void click_back_button_in_crew_trip_log_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele = driver.findElement(By.id("btnBack"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click run button in Crew Trip Log page")
	public void click_run_button_in_crew_trip_log_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRun")));
		ele = driver.findElement(By.id("btnRun"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in Crew Trip Log")
	public void select_valid_from_date_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid to date in Crew Trip Log")
	public void select_valid_to_date_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEndMonth")));
		// Click from date button
		ele = driver.findElement(By.id("txtEndMonth"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender1_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Check table is displayed or not in Crew Trip Log page")
	public void check_table_is_displayed_or_not_in_crew_trip_log_page() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFosFile")));
		ele = driver.findElement(By.id("gvFosFile"));
		if (ele.isDisplayed()) {
			System.out.println("Webtable is displayed");
		} else {
			System.out.println("Webtable is not displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Select valid start time in ZULU Report")
	public void select_valid_start_time_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartHour")));
		ele=driver.findElement(By.id("ddlStartHour"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("10");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartTimeMin")));
		ele1=driver.findElement(By.id("ddlStartTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("15");
		
		driver.switchTo().defaultContent();
	}
	@And("Select valid End time in ZULU Report")
	public void select_valid_end_time_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTime")));
		ele=driver.findElement(By.id("ddlEndTime"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("10");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTimeMin")));
		ele1=driver.findElement(By.id("ddlEndTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("15");
		
		driver.switchTo().defaultContent();
	}
	
	@And("Click choose file button and upload valid file in Crew Trip Log")
	public void click_choose_file_button_and_upload_valid_file_in_crew_trip_log()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click version2 radio button in Crew Trip Log")
	public void click_version2_radio_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlVersion_0")));
		ele = driver.findElement(By.id("ddlVersion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid start time in Future Trips")
	public void select_valid_start_time_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartHour")));
		ele=driver.findElement(By.id("ddlStartHour"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("10");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartTimeMin")));
		ele1=driver.findElement(By.id("ddlStartTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("15");
		
		driver.switchTo().defaultContent();
	}

	@And("Select valid End time in Future Trips")
	public void select_valid_end_time_in_future_trips() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTime")));
		ele=driver.findElement(By.id("ddlEndTime"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("15");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTimeMin")));
		ele1=driver.findElement(By.id("ddlEndTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("30");
		
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in Crew Trip Log")
	public void click_version1_radio_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlVersion_1")));
		ele = driver.findElement(By.id("ddlVersion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in Crew Trip Log")
	public void click_clear_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click upload button in Crew Trip Log")
	public void click_upload_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click download button in Crew Trip Log")
	public void click_download_button_in_crew_trip_log() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click ZULU Report button in FOS File Upload")
	public void click_zulu_report_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[6]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[6]/a/i"));
		ele1.click();
	}

	@And("click help button in ZULU Report")
	public void click_help_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnhelp")));
		ele = driver.findElement(By.id("btnhelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("click sample file button in ZULU Report")
	public void click_sample_file_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkDownload")));
		ele = driver.findElement(By.id("lnkDownload"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click choose file button and upload valid file in ZULU Report")
	public void click_choose_file_button_and_upload_valid_file_in_zulu_report()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid start time in All Quote")
	public void select_valid_start_time_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartHour")));
		ele=driver.findElement(By.id("ddlStartHour"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("10");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlStartTimeMin")));
		ele1=driver.findElement(By.id("ddlStartTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("15");
		
		driver.switchTo().defaultContent();
	}
	@And("Select valid End time in All Quote")
	public void select_valid_end_time_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		//Select HH
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTime")));
		ele=driver.findElement(By.id("ddlEndTime"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("15");
		
		//Select MM
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlEndTimeMin")));
		ele1=driver.findElement(By.id("ddlEndTimeMin"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("30");
		
		driver.switchTo().defaultContent();
	}

	@And("Click version2 radio button in ZULU Report")
	public void click_version2_radio_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_0")));
		ele = driver.findElement(By.id("ddlversion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click daily radio button in ZULU Report")
	public void click_daily_radio_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_0")));
		ele = driver.findElement(By.id("rblFileType_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in ZULU Report")
	public void select_valid_from_date_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in ZULU Report")
	public void select_valid_to_date_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in ZULU Report")
	public void click_clear_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click hourly radio button in ZULU Report")
	public void click_hourly_radio_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_1")));
		ele = driver.findElement(By.id("rblFileType_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in ZULU Report")
	public void click_version1_radio_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_1")));
		ele = driver.findElement(By.id("ddlversion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click upload button in ZULU Report")
	public void click_upload_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click download button in ZULU Report")
	public void click_download_button_in_zulu_report() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click All Quote button in FOS File Upload")
	public void click_all_quote_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[8]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[8]/a/i"));
		ele1.click();
	}

	@Then("Click choose file button and upload valid file in All Quote")
	public void click_choose_file_button_and_upload_valid_file_in_all_quote()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@And("Click version2 radio button in All Quote")
	public void click_version2_radio_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_0")));
		ele = driver.findElement(By.id("ddlversion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click daily radio button in All Quote")
	public void click_daily_radio_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_0")));
		ele = driver.findElement(By.id("rblFileType_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in All Quote")
	public void select_valid_from_date_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in All Quote")
	public void select_valid_to_date_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtToDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDate")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in All Quote")
	public void click_clear_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click hourly radio button in All Quote")
	public void click_hourly_radio_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("rblFileType_1")));
		ele = driver.findElement(By.id("rblFileType_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in All Quote")
	public void click_version1_radio_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_1")));
		ele = driver.findElement(By.id("ddlversion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click upload button in All Quote")
	public void click_upload_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click download button in All Quote")
	public void click_download_button_in_all_quote() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click MX Data button in FOS File Upload")
	public void click_mx_data_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[10]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[10]/a/i"));
		ele1.click();
	}

	@And("Click choose file button and upload valid file in MX Data")
	public void click_choose_file_button_and_upload_valid_file_in_mx_data() throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in MX Data")
	public void select_valid_from_date_in_mx_data() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in MX Data")
	public void select_valid_to_date_in_mx_data() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToMonth")));
		// Click from date button
		ele = driver.findElement(By.id("txtToMonth"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in MX Data")
	public void click_clear_button_in_mx_data() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click upload button in MX Data")
	public void click_upload_button_in_MX_Data() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click download button in MX Data")
	public void click_download_button_in_mx_data() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click Quote Revenue Ver1 button in FOS File Upload")
	public void click_quote_revenue_ver1_button_in_fos_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[14]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[3]/div/div/ul/li[14]/a/i"));
		ele1.click();
	}

	@And("Click choose file button and upload valid file in Quote Revenue Ver1")
	public void click_choose_file_button_and_upload_valid_file_in_quote_revenue_ver1()
			throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\CSV File.csv";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@And("Click version2 radio button in Quote Revenue Ver1")
	public void click_version2_radio_button_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_0")));
		ele = driver.findElement(By.id("ddlversion_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid from date in Quote Revenue Ver1")
	public void select_valid_from_date_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		// Click from date button
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Select valid to date in Quote Revenue Ver1")
	public void select_valid_to_date_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToMonth")));
		// Click from date button
		ele = driver.findElement(By.id("txtToMonth"));
		ele.click();

		// Select valid from date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@And("Click clear button in Quote Revenue Ver1")
	public void click_clear_button_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click version1 radio button in Quote Revenue Ver1")
	public void click_version1_radio_button_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlversion_1")));
		ele = driver.findElement(By.id("ddlversion_1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click upload button in Quote Revenue Ver1")
	public void click_upload_button_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like: " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click download button in Quote Revenue Ver1")
	public void click_download_button_in_quote_revenue_ver1() {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

}
