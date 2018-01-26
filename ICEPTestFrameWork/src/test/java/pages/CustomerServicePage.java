package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerServicePage {

	private WebDriver driver;
	private By HelpText = By.xpath("//h2[contains(text(),'Customer service')]");
	/**
	 * Initializes the driver instance variable .
	 * @param driver Represent the webdriver instance 
	 */
	public CustomerServicePage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Returns an  text message displayed on Help button the screen .
	 * <p>
	 * This method finds Help button  first by using
	 * driver.findElement and get text from that element and return a string value
	 * @return Returns a text out of specified element
	 */
	public String getHelptext() {
		return driver.findElement(HelpText).getText();
	}

}
