package week7.day1.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MergeContact extends BaseClass {

	public static Set<String> windowHandles;
	public static List<String> windows;

	@Then("Click on contacts Button")
	public void clickContactsButton() {
		driver.findElement(By.linkText("Contacts")).click();
	}

	@And("Click on Merge Contacts")
	public void clickMergeContacts() {
		driver.findElement(By.linkText("Merge Contacts")).click();
	}

	@And("Click on Widget of From Contact")
	public void clickWidgetFromContact() {
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();

		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
	}

	@And("Click on First Resulting Contact")
	public void clickFirstContact() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
	}

	@And("Click on Widget of To Contact")
	public void clickWidgetToContact() throws InterruptedException {
		driver.switchTo().window(windows.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();

	}

	@And("Click on Second Resulting Contact")
	public void clickSecondContact() throws InterruptedException {
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a[@class='linktext']"))
				.click();
	}

	@And("Click on Merge button")
	public void clickOnMergeButton() {
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}

	@And("Accept the Alert")
	public void acceptAlert() throws InterruptedException {
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
	}

	@Then("Verify the title of the page")
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		if (title.contains("View Contact")) {
			System.out.println("Title for Merge Contact is verified");
		} else {
			System.out.println("Title for Merge Contact is not verified");
		}

	}
}
