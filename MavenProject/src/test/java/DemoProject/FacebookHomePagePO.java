package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHomePagePO {
	WebDriver driver;
	// By SearchButton=
	// By.xpath("html/body/div[3]/div[1]/div/div[1]/div/div/div/div[1]/div[2]/div/form/div/div/div/div/div[3]");
	By HomeButton = By.id("u_0_3");

	FacebookHomePagePO(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * public void searchProfile(String text) {
	 * driver.findElement(SearchButton).sendKeys(text); }
	 */

	public void HomePage() {
		driver.findElement(HomeButton).click();
	}

	public String HomePageTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
		return Title;
	}
}
