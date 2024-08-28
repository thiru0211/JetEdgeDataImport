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

public class JE_DI_3_GVFileUpload {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check GV File Upload User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check GV File Upload User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check GV File Upload")
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

	@And("close the GV File Upload Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in GV File Upload")
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

	@Then("Click Order Data button in GV File Upload")
	public void click_Order_Data_upload_button_in_GV_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[1]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[1]/a/i"));
		ele1.click();
	}

	@And("Click upload button in GV File Upload")
	public void click_upload_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ButSubmit")));
		ele = driver.findElement(By.id("ButSubmit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like: "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
		
	}
	
	@And("Upload invalid file in GV File Upload")
	public void upload_invalid_file_in_gv_file_upload() throws InterruptedException, AWTException {
		ele = driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Tdery4s")));
		ele = driver.findElement(By.id("Tdery4s"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\Blank.xlsx";
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
	
	@And("Upload valid file in GV File Upload")
	public void upload_valid_file_in_gv_file_upload() throws InterruptedException, AWTException {
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
	
	@Then("Enter valid From Date in GV File Upload")
	public void enter_valid_from_date_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFromDate")));
		ele = driver.findElement(By.id("txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_day_0_0")));
		ele1 = driver.findElement(By.id("calendar1_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@Then("Enter valid to date in GV File Upload")
	public void enter_valid_to_date_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToDate")));
		ele = driver.findElement(By.id("txtToDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid to date in GV File Upload in Revenue Data")
	public void enter_valid_to_date_in_gv_file_upload_in_Revenue_Data() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToMonth")));
		ele = driver.findElement(By.id("txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid to date in GV File Upload in MX Data")
	public void enter_valid_to_date_in_gv_file_upload_in_MX_Data() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtToMonth")));
		ele = driver.findElement(By.id("txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar4_day_5_6")));
		ele1 = driver.findElement(By.id("calendar4_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid to date in GV File Upload in Crew Data")
	public void enter_valid_to_date_in_gv_file_upload_in_Crew_Data() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtEndMonth")));
		ele = driver.findElement(By.id("txtEndMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender1_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid notes {string} in the field")
	public void enter_valid_notes_in_the_field(String Notes) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtNotes")));
		ele = driver.findElement(By.id("txtNotes"));
		ele.sendKeys(Notes);
		driver.switchTo().defaultContent();
	}
	
	@And("click clear button in GV File Upload")
	public void click_clear_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClear")));
		ele = driver.findElement(By.id("btnClear"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Download button in GV File Upload")
	public void click_download_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Leg Data button in GV File Upload")
	public void click_leg_data_button_in_gv_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[2]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[2]/a/i"));
		ele1.click();
	}
	@And("Click Help button in GV File Upload")
	public void click_help_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnhelp")));
		ele = driver.findElement(By.id("btnhelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Help button in GV File Upload in crew data")
	public void click_help_button_in_gv_file_upload_in_crew_data() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnHelp")));
		ele = driver.findElement(By.id("btnHelp"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Sample file button in GV File Upload")
	public void click_sample_file_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lnkDownload")));
		ele = driver.findElement(By.id("lnkDownload"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Revenue Data button in GV File Upload")
	public void click_revenue_data_button_in_gv_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[3]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[3]/a/i"));
		ele1.click();
	}
	
	@Then("Click MX Data button in GV File Upload")
	public void click_mx_data_button_in_gv_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[4]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[4]/a/i"));
		ele1.click();
	}
	
	@Then("Click Crew Data button in GV File Upload")
	public void click_crew_data_button_in_gv_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[5]/a/i")));
		ele1 = driver
				.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[4]/div/div/ul/li[5]/a/i"));
		ele1.click();
	}
	
	@And("Click View Report button in GV File Upload")
	public void click_view_report_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnViewFull")));
		ele = driver.findElement(By.id("btnViewFull"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	@Then("Click Back button in GV File Upload")
	public void click_back_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBack")));
		ele = driver.findElement(By.id("btnBack"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click Run button in GV File Upload")
	public void click_run_button_in_gv_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRun")));
		ele = driver.findElement(By.id("btnRun"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid from date in View Report")
	public void enter_valid_from_date_in_view_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPFromDate")));
		ele = driver.findElement(By.id("txtPFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender2_day_0_0")));
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	@And("Enter valid to date in View Report")
	public void enter_valid_to_date_in_view_report() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPToDate")));
		ele = driver.findElement(By.id("txtPToDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender3_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender3_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	
}
