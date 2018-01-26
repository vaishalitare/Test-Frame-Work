package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

	private By emailIdField = By.xpath("//input[@id ='email'][@type='email']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By confirmPasswordField = By.xpath("//input[@id='confirmPassword']");
	private By createAccBtn = By
			.xpath("//div[@class='large-6 medium-6 small-12 columns right']/descendant::button[@type='submit']");
	private WebDriver driver;

	/**
	 * Initializes the driver instance variable .
	 * @param driver Represent the webdriver instance
	 */
	public CreateAccountPage(WebDriver driver) {
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
		driver.findElement(emailIdField).sendKeys(userName);
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
		driver.findElement(passwordField).sendKeys(strpassword);
	}
	/**
	 * Sets an confirm password on the screen . The strConfirmpassword argument is a specifier
	 * used to send keys by locating the password element.
	 * <p>
	 * This method finds confirnm password element first by using driver.findElement and
	 * sets strConfirmpassword variable on the screen by using sendKeys.
	 * @param strConfirmpassword  Sets the  confirm password in the confirm password field .
	 */
	public void setConfirmPassword(String strConfirmpassword) {
		driver.findElement(confirmPasswordField).sendKeys(strConfirmpassword);
	}
	/**
	 * Clicks on Create account button on the screen
	 * <p>
	 * This method finds a create account button element first by using driver.findElement
	 * and clicks on it by using click.
	 */
	public void clickCreateAccBtn() {
		driver.findElement(createAccBtn).click();
	}

	public void doCreateAcct(String strUsername, String strpassword, String strConfirmpassword) {
		this.setUserName(strUsername);
		this.setPassword(strpassword);
		this.setConfirmPassword(strConfirmpassword);
		this.clickCreateAccBtn();
	}
	/**
	 * Returns an  text message displayed on password field on the screen .
	 * <p>
	 * This method finds a  password element first by using
	 * driver.findElement and gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String getPasswordText() {
		return driver.findElement(passwordField).getText();
	}

}
