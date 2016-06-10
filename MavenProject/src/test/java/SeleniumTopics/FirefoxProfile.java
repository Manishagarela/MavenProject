package SeleniumTopics;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfile {
	WebDriver driver;
	

	
  @Test(enabled = false)
  public void profileFirefox() {
	  ProfilesIni profile = new  ProfilesIni();
	  org.openqa.selenium.firefox.FirefoxProfile myprofile = profile.getProfile("Manisha");
	  driver = new FirefoxDriver(myprofile);
	  driver.get("https://www.google.com");
	  
	  }
  
  @Test
  public void firefoxProfile() {
	  org.openqa.selenium.firefox.FirefoxProfile myprofile = new org.openqa.selenium.firefox.FirefoxProfile(new File("C:\\Users\\Manisha Garela\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\hbgjolbi.default-1437721455368"));
	  driver = new FirefoxDriver(myprofile);
	  driver.get("https://www.google.com");
  }
}
