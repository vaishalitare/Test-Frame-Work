package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AboutOverViewPage;
import pages.CustomerRegisterPage;
import pages.CustomerServicePage;
import pages.HomePageHeader;
import pages.LoginPage;

public class HomePageHeaderTest {
	WebDriver driver;
	HomePageHeader objHomePHeader;
	AboutOverViewPage objAboutOverViewPage;
	CustomerServicePage objCustomerServicePage;
	LoginPage objLoginPage;
	CustomerRegisterPage objCustomerRegisterPage;

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		objHomePHeader = new HomePageHeader(driver);
		objAboutOverViewPage = new AboutOverViewPage(driver);
		objCustomerServicePage = new CustomerServicePage(driver);
		objCustomerRegisterPage = new CustomerRegisterPage(driver);
		objLoginPage = new LoginPage(driver);
		driver.get("https://www.ice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void test_AboutUs() {

		objHomePHeader.clickOnAboutUs();
		Assert.assertTrue(objAboutOverViewPage.getAboutUstext().contains("ABOUT ICE"));

	}

	@Test(priority = 5)
	public void test_Help() {

		objHomePHeader.clickOnHelp();
		Assert.assertTrue(objCustomerServicePage.getHelptext().contains("Customer service"));

	}

	@Test(priority = 4)
	public void test_clickOnSignUp() {

		objHomePHeader.clickOnSignUp();

		Assert.assertTrue(objCustomerRegisterPage.getSignUptext().contains("Create Account"));

	}

	@Test(priority = 3)
	public void test_YourAccount() {

		objHomePHeader.clickOnYourAccount();
		Assert.assertTrue(objLoginPage.getYourAcctText().contains("Registered Customers"));

	}

	@Test(priority = 1)
	public void test_signoutText_afterLogin() {
		objHomePHeader.clickOnYourAccount();
		objLoginPage.doLogin("vaishalitest@gmail.com", "testcase");
		Assert.assertTrue(objHomePHeader.getSignOutText().contains("Sign out"));
	}

	@Test(priority = 2)
	public void test_signupText_afterLogout() {

		objHomePHeader.clickSignOut();
		objHomePHeader.acceptAlert();
		Assert.assertTrue(objHomePHeader.getSignupText().contains("Sign up"));
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
