package testCases;

// remove unused imports using ctrl shift o.
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.HomePageNavPage;

public class HomePageNavTest {
	    WebDriver driver;
		HomePageNavPage objHomePageNavPage;
		CategoryPage objCategoryPage;
		
		
		@BeforeTest
		public void setUp(){
			
			driver = new ChromeDriver();
			objHomePageNavPage = new HomePageNavPage(driver);
			objCategoryPage = new CategoryPage(driver);
			driver.get("https://www.ice.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@Test(priority=0)
		public void test_clickOnYellowGold(){
			
			objHomePageNavPage.clickOnYellowGold();
			
		}
		
		@Test(priority=1)
		public void validatePageText()
		{
			objHomePageNavPage.clickOnYellowGold();
			
			Assert.assertTrue(objCategoryPage.getRingText().contains("Rings"));
			
		}
		
		@Test(priority=1)
		public void validateFilterText()
		{
			objHomePageNavPage.clickOnYellowGold();
			
			Assert.assertTrue(objCategoryPage.verifyFiltersPresent().contains("Material Type/Color:Gold"));
			
		}
		
		
		@AfterSuite
		public void tearDown()
		{
			driver.quit();
		}

}
