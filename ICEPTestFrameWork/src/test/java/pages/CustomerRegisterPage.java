package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegisterPage {

	private By SignUpText = By.xpath("//div[@class='container-fullsize']/h3[contains(text(),'Create Account')]");
	private WebDriver driver;
	/**
	 * Initializes the driver instance variable .
	 * @param driver Represent the webdriver instance 
	 */
	public CustomerRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Returns an  text message displayed on Sign up button the screen .
	 * <p>
	 * This method finds Sign up button  first by using
	 * driver.findElement and gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String getSignUptext() {
		return driver.findElement(SignUpText).getText();
	}

}
