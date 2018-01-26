package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

	private WebDriver driver;
	private By ringText = By.xpath("//span[@ng-if='::categoryName']");
	private By filterTextForGold = By.xpath("//a/span[contains(text(),'Material Type/Color')]");
	private By filterTextForYellow = By.xpath("//a/span[contains(text(),'Material Color')]");

	/**
	 * Initializes the driver instance variable .
	 *@param driver Represent the webdriver instance
	 */
	public CategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Returns an text message displayed on catergory page.
	 * <p>
	 * This method finds Ring text element first by using driver.findElement and
	 * gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String getRingText() {
		return driver.findElement(ringText).getText();
	}
	/**edit
	 * Returns an text message displayed on catergory page.
	 * <p>
	 * This method finds Ring text element first by using driver.findElement and
	 * gets a text from that element and returns a string value
	 * @return Returns a text out of specified element
	 */
	public String verifyFiltersPresent() {
		boolean typeDisplayed = driver.findElement(filterTextForGold).isDisplayed();
		if (typeDisplayed == true) {
			return driver.findElement(filterTextForGold).getText();
		}
		return " ";
	}
}
