package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestUtil;

import pages.AccountDashbaordPage;
import pages.HomePageHeader;
import pages.LoginPage;

public class LoginPageTest {

	WebDriver driver;
	LoginPage objLogin;
	AccountDashbaordPage objDashboard;
	HomePageHeader objHomePHeader;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		objLogin = new LoginPage(driver);
		objDashboard = new AccountDashbaordPage(driver);
		objHomePHeader = new HomePageHeader(driver);
		driver.get("https://www.ice.com/customer/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "getData" ,priority = 0)
	
	public void test_Successful_login(String username, String password) {
        objLogin.doLogin(username, password);
		Assert.assertTrue(objDashboard.getDashboardMessage().contains("Welcome !"));
		objHomePHeader.clickSignOut();
		objHomePHeader.acceptAlert();
	}

	@Test(priority = 1)
	public void test_Login_withOut_password() throws InterruptedException {
        objLogin.invalidLogin("vaishalitest@gmail.com", "");
		Assert.assertTrue(objLogin.getErrorText().contains("Invalid Email Address or Password"));
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void test_Login_withOut_username() throws InterruptedException {
        objLogin.invalidLogin("", "testcase");
		Assert.assertTrue(objLogin.getErrorText().contains("Invalid Email Address or Password"));
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void test_Login_withOut_PasswrdAndUsername() throws InterruptedException {
        objLogin.invalidLogin("", "");
		Assert.assertTrue(objLogin.getErrorText().contains("Invalid Email Address or Password"));
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void test_Login_invalid_password() throws InterruptedException {
		objLogin.invalidLogin("vaishalitest@gmail.com", "");
		Assert.assertTrue(objLogin.getErrorText().contains("Invalid Email Address or Password"));
		Thread.sleep(2000);
	}
	
	@DataProvider
	public static Object[][] getData() {
		return TestUtil.getData("userdata");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}