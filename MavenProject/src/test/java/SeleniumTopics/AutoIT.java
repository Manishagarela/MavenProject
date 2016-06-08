package SeleniumTopics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoIT {
	WebDriver driver;
  @Test
  public void autoITTest() throws IOException {
	  driver = new FirefoxDriver();
	  driver.get("https://my.indeed.com/resume");
	  driver.findElement(By.id("email-input")).sendKeys("hel@46.com");
	  driver.findElement(By.id("confirm-email-input")).sendKeys("hel@46.com");
	  driver.findElement(By.id("upload_resume_button")).click();
	  Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\FileUpload!.exe");
	  //driver.switchTo().alert().dismiss();
  }
}
