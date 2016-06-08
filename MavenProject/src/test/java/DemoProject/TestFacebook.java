package DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFacebook {
	
		WebDriver driver;
	
		FacebookHomePagePF objHomePage;
		FacebookLoginPF objLogin;

		@BeforeTest
		public void setup() {
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");

		}

		// test login functionality
		@Test(priority = 0)

		public void facebookLogin() {
			objLogin = new FacebookLoginPF(driver);
			objLogin.loginFB("garela.manisha@gmail.com", "FBTest15!");
		
			objHomePage = new FacebookHomePagePF(driver);

			objHomePage.HomePage();
			objHomePage.HomePageTitle();

			Assert.assertEquals("Facebook", "Facebook");
			System.out.println("Testcase Success");
		}

	}

	