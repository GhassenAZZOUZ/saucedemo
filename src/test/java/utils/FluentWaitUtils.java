
package utils;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class FluentWaitUtils {

    private WebDriver driver;

    public FluentWaitUtils(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement(By locator){
        Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class)
            .ignoring(StaleElementReferenceException.class);

        return wait.until(d -> d.findElement(locator));
    }
}
