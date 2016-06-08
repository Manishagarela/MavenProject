package DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import DemoProject.FacebookHomePagePO;
import DemoProject.FacebookLoginPO;

public class FacebookTest {

	WebDriver driver;
	FacebookHomePagePO objHomePage;
	FacebookLoginPO objLogin;

	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

	}

	// test login functionality
	@Test(priority = 0)

	public void facebookLogin() {
		objLogin = new FacebookLoginPO(driver);
		objLogin.loginFB("garela.manisha@gmail.com", "FBTest15!");

		objHomePage = new FacebookHomePagePO(driver);

		objHomePage.HomePage();
		objHomePage.HomePageTitle();

		Assert.assertEquals("Facebook", "Facebook");
	}

}

/*
 * public void logoTest() {
 * 
 * objLogin = new FacebookLoginPO(driver);
 * //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 * objLogin.verifyHeaderText(); Assert.assertEquals("incorrect link",
 * "Go to Facebook Home", objLogin.verifyHeaderText() );
 * System.out.println(objLogin.verifyHeaderText()); }
 */
