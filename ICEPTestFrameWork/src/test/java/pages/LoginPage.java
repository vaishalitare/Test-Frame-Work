package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private By emailId = By.xpath("//input[@id='customer-email-address']");
	private By password = By.xpath("//input[@type='password']");
	private By logBtn = By.xpath("//button[contains(text(),'Log In')]");
	private By forgotPassword = By.xpath("//small[contains(text(),'Forgot Your Password?')]");
	private By createAcct = By.xpath("//a[contains(text(),'Create an Account')]");
	private By ConnectFbBtn = By.xpath("//button[@class='button default fb-button expand'][contains(.,'Connect')]");
	private By FBLoginBtn = By.xpath("//button[@class='button default fb-button expand'][contains(.,'Log in')]");
	private By invalidPassword = By.xpath("//div[@class='form-group required']/small[@class='error']");
	private By YourAccountText = By.xpath("//h3[contains(text(),'Registered Customers')]");
	private WebDriver driver;

	/**
	 * Initializes the driver instance variable . 
	 * @param driver  Represent the webdriver instance
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Sets an username on the screen . The UserName argument is a specifier
	 * used to send keys by locating the element.
	 * <p>
	 * This method finds emailId element first by using driver.findElement and
	 * sets Username variable on the screen by using sendKeys.
	 * @param userName Sets the username in the email id field .
	 */
	public void setUserName(String userName) {
		driver.findElement(emailId).sendKeys(userName);
	}

	/**
	 * Sets an password on the screen . The strpassword argument is a specifier
	 * used to send keys by locating the password element.
	 * <p>
	 * This method finds password element first by using driver.findElement and
	 * sets strpassword variable on the screen by using sendKeys.
	 * @param strpassword  Sets the password in the password field .
	 */
	public void setPassword(String strpassword) {
		driver.findElement(password).sendKeys(strpassword);
	}
    /**
	 * Clicks on login button on the screen
	 * <p>
	 * This method finds log in button element first by using driver.findElement
	 * and clicks on by using click.
	 */
	public void clickLogin() {
		driver.findElement(logBtn).click();
	}

	/**
	 * Sets an username on the screen . The UserName is a specifier which is use
	 * to send keys by locating the element
	 * <p>
	 * This method finds emailId element first by using driver.findElement and
	 * sets Username variable on the screen by using sendKeys.
	 * 
	 * @ for setting UserName on the screen
	 * 
	 */
	public void doLogin(String strUsername, String strpassword) {
		this.setUserName(strUsername);
		this.setPassword(strpassword);
		this.clickLogin();
	}

	/**
	 * Sets username and Password on the screen . The strUserName and
	 * strPassword are a specifiers used to assign
	 * <p>
	 * This method finds emailId element first by using driver.findElement and
	 * sets Username variable on the screen by using sendKeys.
	 * 
	 * @param userName
	 *            for setting UserName on the screen
	 * 
	 */
	public void invalidLogin(String strUserName, String strPassword) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
		driver.findElement(emailId).clear();
		driver.findElement(password).clear();
	}

	/**
	 * Returns an error text message displayed on the screen .
	 * <p>
	 * This method finds emailId error text message first by using
	 * driver.findElement and get text from that element and return a string value
	 * @return error text out of specified element
	 */
	public String getErrorText() {
		return driver.findElement(invalidPassword).getText();
	}

	/**
	 * Returns a text out of Your account button .
	 * <p>
	 * This method finds Your account button element first by using
	 * driver.findElement and returns the visible text on the screen
	 *  @return text out of specified element
	 */
    public String getYourAcctText() {
		return driver.findElement(YourAccountText).getText();
	}
}
