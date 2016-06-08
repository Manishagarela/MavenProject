package DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPO {
	WebDriver driver;

	By EmailTextBox = By.id("email");
	By PasswordTextBox = By.id("pass");
	By FBheader = By.xpath("html/body/div[3]/div[2]/div[1]/div/div/div/div/div[1]/h2");
	By LoginButton = By.id("u_0_o");
	By Forgotaccountlink = By.partialLinkText("Forgot account");

	FacebookLoginPO(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String username) {
		driver.findElement(EmailTextBox).sendKeys(username);
	}

	public void setPassword(String password) {
		driver.findElement(PasswordTextBox).sendKeys(password);
	}

	public void login() {
		driver.findElement(LoginButton).click();
	}

	public void loginFB(String username, String password) {
		setUserName(username);
		setPassword(password);
		login();

	}

	public String verifyHeaderText() {
		String text = driver.findElement(FBheader).getText();

		System.out.println(text);
		return text;
	}
}