package DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeMaven {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  Assert.assertTrue(true);
  }
}
