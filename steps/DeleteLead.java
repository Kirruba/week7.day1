package week7.day1.steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass {

	public static String firstLead;

	@Given("Click on Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@When("Enter phone number as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}

	@Then("Capture lead ID of First Resulting lead")
	public void captureFirstLeadID() throws InterruptedException {

		Thread.sleep(10000);
		firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The Lead ID of First Resulting lead is:" + firstLead);
	}

	@Then("Click Delete")
	public void clickDelete() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}

	@When("Enter captured lead ID")
	public void enterCapturedLead() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(firstLead);
	}

	@Then("Verify message as {string} in the Lead List")
	public void verifyMessage(String verifyMessage) throws InterruptedException {
		Thread.sleep(10000);
		String verifymsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if (verifymsg.contains(verifyMessage)) {
			System.out.println("Deletion of a First Resulting lead is successful");
		} else {
			System.out.println("Deletion of a First Resulting lead is not successful");
		}
	}

}
