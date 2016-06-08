package DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPF {
 WebDriver driver;
 @FindBy (id="email")
 WebElement TextBox;
 
 @FindBy (id="pass")
 WebElement Password;
 
 @FindBy (id="u_0_o")
 WebElement Lognbtn; 


FacebookLoginPF(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void setUserName(String username) {
	TextBox.sendKeys(username);
}

public void setPassword(String password) {
	Password.sendKeys(password);
}

public void login() {
	Lognbtn.click();
}

public void loginFB(String username, String password) {
	setUserName(username);
	setPassword(password);
	login();

}


}
