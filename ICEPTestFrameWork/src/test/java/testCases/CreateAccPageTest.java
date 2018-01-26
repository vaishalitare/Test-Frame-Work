package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CreateAccountPage;

public class CreateAccPageTest {
	WebDriver driver;
	final int strLength = 6;
	CreateAccountPage objCreateAccPage;

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		objCreateAccPage = new CreateAccountPage(driver);
		driver.get("https://www.ice.com/customer/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Parameters({ "username", "password", "confirmPassword" })
	@Test(priority = 0)
	public void test_verifyPasswordLength(String username, String password, String confirmPassword) {

		objCreateAccPage.setUserName(username);
		objCreateAccPage.setPassword(password);
		objCreateAccPage.setConfirmPassword(confirmPassword);
		Assert.assertTrue(password.length() > strLength);
		Assert.assertEquals(password, confirmPassword);

		objCreateAccPage.clickCreateAccBtn();

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}