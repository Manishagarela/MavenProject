package DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePagePF {
	WebDriver driver;

@FindBy (id="u_0_3")
WebElement HomeButton;

	FacebookHomePagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public void HomePage() {
		HomeButton.click();
	}

	public String HomePageTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
		return Title;
	}
}
	