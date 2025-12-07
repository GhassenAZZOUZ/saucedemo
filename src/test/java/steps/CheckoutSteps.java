package steps;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

import pages.*;
import utils.BaseTest;

public class CheckoutSteps extends BaseTest {

    LoginPage login;
    ProductsPage products;
    CartPage cart;
    CheckoutStepOnePage stepOne;
    CheckoutOverviewPage overview;
    CheckoutCompletePage complete;

    @Given("I open the browser")
    public void i_open_the_browser(){
        setUp();
        login = new LoginPage(driver);
        products = new ProductsPage(driver);
    }

    @Given("Je me connecte")
    public void i_login(){
        login.login("standard_user","secret_sauce");
        assertEquals("Products", products.getTitle());
    }

    @When("J'ajoute deux articles au panier")
    public void i_add_products(){
        products.addTwoProducts();
        assertEquals("2", products.getCartCount());
    }

    @When("Je vérifie le panier")
    public void i_verify_cart(){
        products.openCart();
        cart = new CartPage(driver);

        assertEquals(2, cart.getItemCount());

    }
    @When("I checkout")
    public void i_checkout(){
        products.openCart();
        cart = new CartPage(driver);

        cart.clickCheckout();

        double item = overview.getItemTotal();
        double tax = overview.getTax();
        double total = overview.getTotal();

        assertEquals(item + tax, total);

        overview.clickFinish();
    }

    @And("")
    public void I_(){

    }
    @Then("I see confirmation")
    public void i_see_confirmation(){
        complete = new CheckoutCompletePage(driver);
        assertEquals("Thank you for your order!", complete.getConfirmationMessage());
        assertTrue(complete.isImageDisplayed());
        complete.clickBackHome();
        tearDown();
    }
}
