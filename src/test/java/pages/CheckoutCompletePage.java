
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class CheckoutCompletePage {

    WebDriver driver;
    FluentWaitUtils wait;

    By message = By.className("complete-header");
    By image = By.className("pony_express");
    By backHome = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public String getConfirmationMessage(){
        return wait.waitForElement(message).getText();
    }

    public boolean isImageDisplayed(){
        return wait.waitForElement(image).isDisplayed();
    }

    public void clickBackHome(){
        wait.waitForElement(backHome).click();
    }
}
