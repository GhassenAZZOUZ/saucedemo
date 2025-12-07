
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class LoginPage {

    WebDriver driver;
    FluentWaitUtils wait;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public void login(String user, String pass){
        wait.waitForElement(username).sendKeys(user);
        wait.waitForElement(password).sendKeys(pass);
        wait.waitForElement(loginBtn).click();
    }
}
