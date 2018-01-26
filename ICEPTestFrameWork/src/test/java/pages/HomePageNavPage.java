package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageNavPage {

	private By HoverRings = By.xpath("//a[@class='top-level'][contains(text(),'Rings')]");
	private By YellowGold = By.linkText("Yellow Gold");
	private WebDriver driver;

	/**
	 * Initializes the driver instance variable .
	 * 
	 * @param driver
	 *            Represent the webdriver instance
	 */
	public HomePageNavPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Hoover on Rings on homepage navigation and clicks on Yellow gold ring on the screen . 
	 * <p>
	 * This method finds Ring element on top navigation menu element first by using driver.findElement and
	 * and use action class to hoover and click on specified element .
	 */
	public void clickOnYellowGold() {
		WebElement element = driver.findElement(HoverRings);
		Actions action = new Actions(driver);
		action.moveToElement(element).moveToElement(driver.findElement(YellowGold)).click().build().perform();
	}
}
