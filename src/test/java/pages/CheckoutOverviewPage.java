
package pages;

import org.openqa.selenium.*;
import utils.FluentWaitUtils;

public class CheckoutOverviewPage {

    WebDriver driver;
    FluentWaitUtils wait;

    By itemTotal = By.className("summary_subtotal_label");
    By tax = By.className("summary_tax_label");
    By total = By.className("summary_total_label");
    By finishBtn = By.id("finish");

    public CheckoutOverviewPage(WebDriver driver){
        this.driver = driver;
        this.wait = new FluentWaitUtils(driver);
    }

    public double getItemTotal(){
        return Double.parseDouble(wait.waitForElement(itemTotal).getText().replace("Item total: $",""));
    }

    public double getTax(){
        return Double.parseDouble(wait.waitForElement(tax).getText().replace("Tax: $",""));
    }

    public double getTotal(){
        return Double.parseDouble(wait.waitForElement(total).getText().replace("Total: $",""));
    }

    public void clickFinish(){
        wait.waitForElement(finishBtn).click();
    }
}
