package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IFrame {
	WebDriver driver;
	
  @Test
  public void Iframe () {
	  driver = new FirefoxDriver();
	  driver.get("http://www.guru99.com/selenium-tutorial.html");
	  int size= driver.findElements(By.tagName("iframe")).size();
	  System.out.println(size);
	  for(int i=0;i<=size;i++)
	  {
		  driver.switchTo().frame(i);
		  int total = driver.findElements(By.linkText("Contact us")).size();
		 System.out.println(total);
		  
		  
	  }
	  //driver.switchTo().frame("_mN_beacons");
	  System.out.println("switch to frame successful");
	//driver.findElement(By.xpath("html/body/div[1]/footer/div/div/div[1]/div[1]/div[2]/div/div/div/div[3]/div/div/div[2]/div/a/img")).click();
	driver.switchTo().parentFrame();

	//driver.findElement(By.id("input_1")).sendKeys("Manisha");
	  
	  
  }
}
