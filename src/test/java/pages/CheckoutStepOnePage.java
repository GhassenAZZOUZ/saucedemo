
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class CheckoutStepOnePage {

    WebDriver driver;
    FluentWaitUtils wait;

    By first = By.id("first-name");
    By last = By.id("last-name");
    By zip = By.id("postal-code");
    By continueBtn = By.id("continue");

    public CheckoutStepOnePage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public void fillForm(String f, String l, String z){
        wait.waitForElement(first).sendKeys(f);
        wait.waitForElement(last).sendKeys(l);
        wait.waitForElement(zip).sendKeys(z);
        wait.waitForElement(continueBtn).click();
    }
}
