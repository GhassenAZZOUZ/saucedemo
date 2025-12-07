
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class CartPage {

    WebDriver driver;
    FluentWaitUtils wait;

    By cartItems = By.className("cart_item");
    By checkout = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public int getItemCount(){
        return driver.findElements(cartItems).size();
    }

    public void clickCheckout(){
        wait.waitForElement(checkout).click();
    }
}
