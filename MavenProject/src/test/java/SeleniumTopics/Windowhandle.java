package SeleniumTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windowhandle {
  @Test
  public void windowHandle() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://egov.uscis.gov/casestatus/landing.do");
	  driver.findElement(By.linkText("FORMS")).click();
	  String mainwindow= driver.getWindowHandle();
	  Set<String> s = driver.getWindowHandles();
	  Iterator<String> I = s.iterator();
	  while (I.hasNext())
	  {
	 String childwindow = I.next();
		 if(!mainwindow.equals(childwindow)) 
		 {
			 driver.findElement(By.partialLinkText("Department of State")).click();
			 driver.navigate().back();
			// driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div/div[3]/div/div[2]/ul/li[5]/a/img")).click();
			 
			 
		 }}
		 
		 driver.switchTo().window(mainwindow);
	  }
  }
/*
driver.findElement(By.id(“id of the link/button which opens new window”)).click();
//wait till two windows are not opened
waitForNumberofWindowsToEqual(2);//this method is for wait

Set handles = driver.getWindowHandles();
firstWinHandle = driver.getWindowHandle(); handles.remove(firstWinHandle);
String winHandle=handles.iterator().next();
if (winHandle!=firstWinHandle){
//To retrieve the handle of second window, extracting the handle which does not match to first window handle
secondWinHandle=winHandle; //Storing handle of second window handle

//Switch control to new window
driver.switchTo().window(secondWinHandle);
//Control is switched now
}[/code] */
