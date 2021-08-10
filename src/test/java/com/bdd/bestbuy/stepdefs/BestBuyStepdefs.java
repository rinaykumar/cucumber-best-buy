package com.bdd.bestbuy.stepdefs;

import com.bdd.bestbuy.pages.BestBuyHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyStepdefs {

    private BestBuyHome bestBuyHome;

    /*** Paul Cha ***/

    @Given("I am on the Best Buy home page")
    public void iAmOnTheBestBuyHomePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        bestBuyHome = new BestBuyHome(driver);
    }

    @When("I close the add modal and search for 'macbook pro'")
    public void iCloseTheAddModalAndSearchForMacbookPro() {
        // Wait for page to load
        bestBuyHome.waitForPageLoad(10);

        // Click add modal close button

        // Click searchbar

        // Send keys "macbook pro" to searchbar

        // Click search button

    }

    @Then("One of the laptops listed should be 13.3 8GB Memory and 256GB SSD")
    public void oneOfTheLaptopsListedShouldBeGBMemoryAndGBSSD() {
        String macbookInfo = "MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray";

        // Assert macbookInfo with label from page

        // Quit driver
        bestBuyHome.Quit();
    }

    /*** Rinay Kumar ***/

    @When("I click the 'Add to Cart' button next to the laptop")
    public void iClickTheAddToCartButtonNextToTheLaptop() {
        // Wait for page to load
        bestBuyHome.waitForPageLoad(15);

        // Click add to cart button
        bestBuyHome.getAddToCartButton().click();
    }

    @Then("I should see a modal window with the cart subtotal")
    public void iShouldSeeAModalWindowWithTheCartSubtotal() {
        // Switch to modal and wait
        bestBuyHome.switchToCartSubtotalModal();
        bestBuyHome.waitForPageLoad(15);

        // Check modal for cart subtotal label
        String cartSubtotalLabel = bestBuyHome.getCartSubtotalLabel().getText();
        Assert.assertTrue(cartSubtotalLabel.contains("Subtotal"));

        // Quit driver
        bestBuyHome.Quit();
    }

    /*** Kwabena Bamfo ***/

    @When("I click on the 'Go to Cart' button")
    public void iClickOnTheGoToCartButton() {
        // Click go to cart button

    }

    @Then("I should see the laptop and the order summary with Total price")
    public void iShouldSeeTheLaptopAndTheOrderSummaryWithTotalPrice() {
        String macbookInfo = "MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray";

        // Wait for page to load
        bestBuyHome.waitForPageLoad(5);

        // Assert macbookInfo with label from page

        // Assert "Order Summary" label appears on page

        // Assert "Total" label appears on page

        // Quit driver
        bestBuyHome.Quit();
    }

    /*** Sheena Mathew ***/

    @When("I click the 'Remove' link under the item number drop down")
    public void iClickTheRemoveLinkUnderTheItemNumberDropDown() {
        // Click remove link

    }

    @Then("My anonymous cart should be empty")
    public void iMyAnonymousCartShouldBeEmpty() {
        // Assert "Your cart is empty" label appears on page

        // Quit driver
        bestBuyHome.Quit();
    }
}
