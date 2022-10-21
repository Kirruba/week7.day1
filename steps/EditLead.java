package week7.day1.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditLead extends BaseClass {

	@And("Click Find leads")
	public void findLeads() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}

	@And("Enter first name as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.xpath("//div[@class='x-tab-panel-body x-tab-panel-body-top']//input[@name='firstName']"))
				.sendKeys(firstName);
	}

	@And("Click Find leads button")
	public void clickFindLeadsButton() {
		driver.findElement(By.xpath("//div[@class='x-panel-footer x-panel-footer-noborder']//button")).click();
	}

	@And("Click on first resulting lead")
	public void clickFirstLead() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Then("Verify title of the page")
	public void verifyTitle() {
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("Title for Edit Lead is verified successfully");
		} else {
			System.out.println("Title for Edit Lead is not verified successfully");
		}
	}

	@And("Click Edit")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Change the company name as {string}")
	public void changecompanyName(String companyName) {
		WebElement CName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		CName.clear();
		CName.sendKeys(companyName);
	}

	@And("Click Update")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

	@Then("Confirm the changed name appears as given as {string}")
	public void confirmChange(String companyName) throws InterruptedException {
		String changeName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		Thread.sleep(5000);
		if (changeName.contains(companyName)) {
			System.out.println("Company Name is verified successfully");
		} else {
			System.out.println("Company Name is not updated successfully");
		}
	}
}
