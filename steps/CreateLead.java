package week7.day1.steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateLead extends BaseClass {

	@And("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click on Leads")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click on Create Lead link")
	public void clickCreateLeadlink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter Company Name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@And("Enter First Name as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@And("Enter Last Name as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@And("Click on Create Lead button")
	public void clickCreateLeadbutton() throws InterruptedException {
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
	}

	@Then("Verify the lead creation")
	public void verifyLeadCreation() {
		String title = driver.getTitle();
		System.out.println("The title is " + title);
		if (title.contains("View Lead")) {
			System.out.println("Lead creation is successful");
		} else {
			System.out.println("Lead creation is not successful");
		}

	}

}
