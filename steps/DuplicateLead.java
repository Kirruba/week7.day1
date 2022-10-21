package week7.day1.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DuplicateLead extends BaseClass {

	@And("Enter FirstNameLocal as {string}")
	public void enterLocalFirstName(String localFirstName) {
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localFirstName);
	}

	@And("Enter Department as {string}")
	public void enterDepartment(String department) {
		driver.findElement(By.name("departmentName")).sendKeys(department);
	}

	@And("Enter Description as {string}")
	public void enterDescription(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
	}

	@And("Enter email as {string}")
	public void enterEmail(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}

	@And("Select StateProvince as {string}")
	public void selectState(String state) {
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(State);
		dd.selectByVisibleText(state);
	}

	@Then("Click on Duplicate button")
	public void clickDuplicateButton() {
		driver.findElement(By.className("subMenuButton")).click();
	}

	@And("Clear the CompanyName Field And Enter new CompanyName as {string}")
	public void clearEnterNewCompanyName(String newCompanyName) {
		WebElement newCName = driver.findElement(By.id("createLeadForm_companyName"));
		newCName.clear();
		newCName.sendKeys(newCompanyName);
	}

	@And("Clear the FirstName Field And Enter new FirstName as {string}")
	public void clearEnterNewFirstName(String newFirstName) {
		WebElement newFName = driver.findElement(By.id("createLeadForm_firstName"));
		newFName.clear();
		newFName.sendKeys(newFirstName);
	}

}
