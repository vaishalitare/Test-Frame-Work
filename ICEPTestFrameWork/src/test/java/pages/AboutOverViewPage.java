package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutOverViewPage {
	private WebDriver driver;
	private By AboutUsText = By.xpath("//span[contains(text(),'About ICE')]");
	/**
	 * Initializes the driver instance variable .
	 *@param driver Represent the webdriver instance
	 */
	public AboutOverViewPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Returns an  text message displayed on the screen .
	 * <p>
	 * This method finds About Us text first by using
	 * driver.findElement and gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String getAboutUstext() {
		return driver.findElement(AboutUsText).getText();
	}

}
