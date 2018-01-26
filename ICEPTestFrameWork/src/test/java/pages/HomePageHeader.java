package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageHeader {
	private By SignOutBtn = By.xpath("//a[@class='topline-link'][@ng-click='logout()']");
	private By YourAcctBtn = By.xpath("//a[@class='topline-link'][contains(text(),'Your Account')]");
	private By SignupBtn = By.xpath("//a[@class='topline-link'][contains(text(),'Sign up')]");
	private By HelpBtn = By.xpath("//a[@class='topline-link'][contains(text(),'Help')]");
	private By AboutUsBtn = By.xpath("//a[@class='topline-link'][contains(text(),'About us')]");
	private By WishListBtn = By.xpath("//a[@class='topline-link'][contains(text(),'Wishlist')]");
	private WebDriver driver;
	private WebDriverWait wait;
	/**
	 * Initializes the driver instance variable .
	 * @param driver Represent the webdriver instance 
	 */
	public HomePageHeader(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	/**
	 * Clicks on Sign out button on the screen
	 * <p>
	 * This method finds Sign out button element first by using driver.findElement
	 * and clicks on by using click.
	 */
	public void clickSignOut() {
		driver.findElement(SignOutBtn).click();
	}
	/**
	 * Accepts an alert message appeared on the screen .
	 * <p>
	 * This method accepts an alert message appeared after User clicks on Sign out button
	 */
    public void acceptAlert() {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.accept();
	}
	/**
	 * Clicks on Help button on the screen
	 * <p>
	 * This method finds Help button first by using driver.findElement
	 * and clicks on by using click.
	 */
	public void clickOnHelp() {
		driver.findElement(HelpBtn).click();
	}
	/**
	 * Clicks on About us button on the screen
	 * <p>
	 * This method finds About us button  first by using driver.findElement
	 * and clicks on by using click.
	 */
    public void clickOnAboutUs() {
		driver.findElement(AboutUsBtn).click();
	}
    /**
	 * Clicks on Wish list button on the screen
	 * <p>
	 * This method finds  Wish list button first by using driver.findElement
	 * and clicks on by using click.
	 */
    public void clickOnWishList() {
		driver.findElement(WishListBtn).click();
	}
    /**
	 * Clicks on Your Account button on the screen
	 * <p>
	 * This method finds Your Account button first by using driver.findElement
	 * and clicks on by using click.
	 */
	public void clickOnYourAccount() {
		driver.findElement(YourAcctBtn).click();
	}
	/**
	 * Clicks on Sign up button on the screen
	 * <p>
	 * This method finds Sign Up button first by using driver.findElement
	 * and clicks on by using click.
	 */
    public void clickOnSignUp() {
		driver.findElement(SignupBtn).click();
	}
    /**
	 * Returns an text message displayed on  Sign out button the screen 
	 * <p>
	 * This method finds Sign out button first by using
	 * driver.findElement and get text from that element and return a string value
	 * @return Returns a text out of specified element
	 */
	public String getSignOutText() {
		return driver.findElement(SignOutBtn).getText();
	}
	/**
	 * Returns an  text message displayed on Sign up button on the screen .
	 * <p>
	 * This method finds Sign Up button text first by using
	 * driver.findElement and get text from that element and return a string value
	 * @return Returns a text out of specified element
	 */
	public String getSignupText() {
		return driver.findElement(SignupBtn).getText();
	}

}
