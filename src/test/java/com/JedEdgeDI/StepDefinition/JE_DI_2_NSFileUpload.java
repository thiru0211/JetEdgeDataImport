package com.JedEdgeDI.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class JE_DI_2_NSFileUpload {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check PL File Upload User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check PL File Upload User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check PL File Upload")
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

	@And("close the PL File Upload Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Check Page Landed to Homepage or not in PL File Upload")
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

	@Then("Click PL File Upload button in NS File Upload")
	public void click_pl_file_upload_button_in_ns_file_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/a/span[1]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/div/div/ul/li/a")));
		ele1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div[1]/nav/div/ul/li[2]/div/div/ul/li/a"));
		ele1.click();
	}

	@And("Click Add Users button in PL File Upload")
	public void click_add_users_button_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAddAddress")));
		ele = driver.findElement(By.id("btnAddAddress"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click close button in Admin Users")
	public void click_close_button_in_admin_users() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgClose")));
		ele = driver.findElement(By.id("imgClose"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select a checkbox of a customer name in Admin Users")
	public void select_a_checkbox_of_a_customer_name_in_admin_users() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvpAddress_chkStatus_434")));
		ele = driver.findElement(By.id("gvpAddress_chkStatus_434"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvpAddress_chkStatus_439")));
		ele1 = driver.findElement(By.id("gvpAddress_chkStatus_439"));
		if(!ele1.isSelected()) {
		ele1.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click submit button in Admin Users")
	public void click_submit_button_in_admin_users() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
		ele = driver.findElement(By.id("btnAdd"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Select valid name in signature dropdown in PL File Upload")
	public void select_valid_name_in_signature_dropdown_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ddlSignature")));
		ele = driver.findElement(By.id("ddlSignature"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("thirumaran0828@outlook.com");
		driver.switchTo().defaultContent();
	}

	@And("Click the update button in PL File Upload")
	public void click_the_update_button_in_pl_file_upload() throws InterruptedException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnEMAILUpdate")));
		ele = driver.findElement(By.id("btnEMAILUpdate"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@And("Select valid year in the box in PL File Upload")
	public void select_valid_year_in_the_box_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtYear")));
		ele = driver.findElement(By.id("txtYear"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cal2_year_1_0")));
		ele1 = driver.findElement(By.id("cal2_year_1_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click download button in PL File Upload")
	public void click_download_button_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click log button in PL File Upload")
	public void click_log_button_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbLog_0")));
		ele = driver.findElement(By.id("gvFileLog_imbLog_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click close button in History")
	public void click_close_button_in_history() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgpClose")));
		ele = driver.findElement(By.id("imgpClose"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click manual upload button in NS File Upload")
	public void click_manual_upload_button_in_ns_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ancLeasedFrom")));
		ele = driver.findElement(By.id("ancLeasedFrom"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("click upload button in manual upload")
	public void click_upload_button_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnUpload")));
		ele = driver.findElement(By.id("btnUpload"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert message is displayed");
		}
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert message is displayed");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click download sample button in manual upload")
	public void click_download_sample_button_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("LinkButton1")));
		ele = driver.findElement(By.id("LinkButton1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@Then("Click file upload and upload valid file in manual upload")
	public void click_file_upload_and_upload_valid_file_in_manual_upload() throws InterruptedException, AWTException {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[4]/table[1]/tbody/tr[2]/td/div/div/div/div[2]/table/tbody/tr[2]/td[2]")));
		ele = driver.findElement(By.xpath("/html/body/form/div[4]/table[1]/tbody/tr[2]/td/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
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
	@Then("Select valid month in manual upload")
	public void select_valid_month_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMonth")));
		ele = driver.findElement(By.id("txtMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("calendar1_month_0_0")));
		ele1= driver.findElement(By.id("calendar1_month_0_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Select valid File generation Date in NS in manual upload")
	public void select_valid_file_generation_date_in_ns_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtFilegeneration")));
		ele = driver.findElement(By.id("txtFilegeneration"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender1_day_5_6")));
		ele1= driver.findElement(By.id("CalendarExtender1_day_5_6"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Enter valid notes {string} in manual upload")
	public void enter_valid_notes_in_manual_upload(String Notes) {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtMonth")));
		ele = driver.findElement(By.id("txtMonth"));
		ele.sendKeys(Notes);
		driver.switchTo().defaultContent();
	}
	
	@Then("Select valid year in the box in manual upload")
	public void select_valid_year_in_the_box_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtYear")));
		ele = driver.findElement(By.id("txtYear"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cal2_year_1_0")));
		ele1 = driver.findElement(By.id("cal2_year_1_0"));
		ele1.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click download button in manual Upload")
	public void click_download_button_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbExport_0")));
		ele = driver.findElement(By.id("gvFileLog_imbExport_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click log button in manual Upload")
	public void click_log_button_in_manual_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvFileLog_imbLog_0")));
		ele = driver.findElement(By.id("gvFileLog_imbLog_0"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@Then("Click close button in manual History")
	public void click_close_button_in_manual_history() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgpClose")));
		ele = driver.findElement(By.id("imgpClose"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	@And("Click Delete the name in the table in PL File Upload")
	public void click_delete_the_name_in_the_table_in_pl_file_upload() {
		ele=driver.findElement(By.id("loadFrame"));
		driver.switchTo().frame(ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gvToAddress_imbDel_6")));
		ele = driver.findElement(By.id("gvToAddress_imbDel_6"));
		ele.click();
		driver.switchTo().defaultContent();
	}
	
	
}
