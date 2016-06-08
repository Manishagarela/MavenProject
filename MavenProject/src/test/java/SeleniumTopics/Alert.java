package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	
  @Test
  public void alertTest() {
	driver = new FirefoxDriver();
	  driver.get("https://egov.uscis.gov/casestatus/landing.do");
	  driver.findElement(By.xpath("html/body/div[2]/form/div/div[1]/div/div[1]/fieldset/div[2]/div[2]/input")).click();
	
 org.openqa.selenium.Alert alert = driver.switchTo().alert();
	  String alerttext =  alert.getText();
	 System.out.println(alerttext);
	 alert.accept();
	 System.out.println("Switch success");
  }
	
  
}
