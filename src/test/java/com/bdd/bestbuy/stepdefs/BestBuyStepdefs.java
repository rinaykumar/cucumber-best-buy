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
        bestBuyHome.waitForPageLoad(5);

        // Click add modal close button
        bestBuyHome.closeModal();

        // Click searchbar
        bestBuyHome.getSearchBar().click();

        // Close survey modal
        bestBuyHome.dismissModals();

        // Send keys "macbook pro" to searchbar
        bestBuyHome.getSearchBar().sendKeys("macbook pro");

        // Click search button
        bestBuyHome.submitSearch().click();
    }

    @Then("One of the laptops listed should be 13.3 8GB Memory and 256GB SSD")
    public void oneOfTheLaptopsListedShouldBeGBMemoryAndGBSSD() {
        // Get macbook description from page
        String macBookDescription = bestBuyHome.getMacbookModel();

        // Assert macBookDescription
        Assert.assertEquals("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray", macBookDescription);

        // Quit driver
        bestBuyHome.Quit();
    }

    /*** Rinay Kumar ***/

    @When("I click the 'Add to Cart' button next to the laptop")
    public void iClickTheAddToCartButtonNextToTheLaptop() {
        // Click add to cart button
        bestBuyHome.getAddToCartButton().click();

        // Close gifts modal
        bestBuyHome.dismissModals();

        // Check there isn't an add to cart error message
        Assert.assertFalse(bestBuyHome.isAddToCartError());
    }

    @Then("I should see a modal window with the cart subtotal")
    public void iShouldSeeAModalWindowWithTheCartSubtotal() {
        // Switch to modal
        bestBuyHome.switchToCartSubtotalModal();

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
        bestBuyHome.iClickOnTheGoToCartButton().click();

        //driver.findElement(By.linkText("Go to Cart")).click();
    }

    @Then("I should see the laptop and the order summary with Total price")
    public void iShouldSeeTheLaptopAndTheOrderSummaryWithTotalPrice() {
        String macbookInfo = "MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray";

        // Wait for page to load
        bestBuyHome.waitForPageLoad(5);

        // Assert macbookInfo with label from page

        Assert.assertEquals(bestBuyHome.getLaptopInfo().getText(), macbookInfo);
        // Assert "Order Summary" label appears on page
        Assert.assertEquals(bestBuyHome.getOrderLabel().getText(), "Order Summary");
        // Assert "Total" label appears on page
        Assert.assertEquals(bestBuyHome.getTotalLabel().getText(), "Total");
        // Quit driver
        bestBuyHome.Quit();
    }

    /*** Sheena Mathew ***/

    @When("I click the 'Remove' link under the item number drop down")
    public void iClickTheRemoveLinkUnderTheItemNumberDropDown() {
        // Click remove link
        bestBuyHome.getRemoveButton().click();
    }

    @Then("My anonymous cart should be empty")
    public void iMyAnonymousCartShouldBeEmpty() {
        // Assert "Your cart is empty" label appears on page
        Assert.assertEquals("Your cart is empty", bestBuyHome.getEmptyCart().getText());
        // Quit driver
        bestBuyHome.Quit();
    }
}
