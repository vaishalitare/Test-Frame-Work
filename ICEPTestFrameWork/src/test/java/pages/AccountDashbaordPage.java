package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDashbaordPage {
	private WebDriver driver;
	private By text = By.xpath("//div[@ng-if='loggedin==true']/p[contains(text(),'Welcome')]");
	/**
	 * Initializes the driver instance variable .
	 *@param driver Represent the webdriver instance
	 */
	public AccountDashbaordPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Returns an  text message displayed on customer dash board .
	 * <p>
	 * This method finds Dash board text first by using
	 * driver.findElement if User is logged in . Then gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String getDashboardMessage() {
		return driver.findElement(text).getText();
	}

}
