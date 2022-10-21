package week7.day1.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseClass {

	@Given("Launch the Chrome Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("Load URL and maximize")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("Enter Username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter Password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Click on login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify Homepage is displayed")
	public void verifyLogin() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("Login is successful");

		} else {
			System.out.println("Login is not successful");
		}

	}

	@But("Verify Error meassage is displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}

	@And("Close driver")
	public void closeDriver() {
		driver.close();
	}

}
