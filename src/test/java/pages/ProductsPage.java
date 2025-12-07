
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class ProductsPage {

    WebDriver driver;
    FluentWaitUtils wait;

    By title = By.className("title");
    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By cartBadge = By.className("shopping_cart_badge");
    By cartLink = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public String getTitle(){
        return wait.waitForElement(title).getText();
    }

    public void addTwoProducts(){
        wait.waitForElement(backpack).click();
        wait.waitForElement(bikeLight).click();
    }

    public String getCartCount(){
        return wait.waitForElement(cartBadge).getText();
    }

    public void openCart(){
        wait.waitForElement(cartLink).click();
    }
}
