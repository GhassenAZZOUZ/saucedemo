package pages;

import org.junit.jupiter.api.Assertions;
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

        WebElement firstName = wait.waitForElement(first);
        WebElement lastName = wait.waitForElement(last);
        WebElement zipCode = wait.waitForElement(zip);

        firstName.clear();
        firstName.sendKeys(f);

        lastName.clear();
        lastName.sendKeys(l);

        zipCode.clear();
        zipCode.sendKeys(z);

        Assertions.assertEquals(f, firstName.getAttribute("value"), "Le champ First Name n'a pas été correctement renseigné.");
        Assertions.assertEquals(l, lastName.getAttribute("value"), "Le champ Last Name n'a pas été correctement renseigné.");
        Assertions.assertEquals(z, zipCode.getAttribute("value"), "Le champ Zip Code n'a pas été correctement renseigné.");

        wait.waitForElement(continueBtn).click();
    }
}
