package com.bdd.bestbuy.stepdefs;

import com.bdd.bestbuy.pages.BestBuyHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BestBuyStepdefs {

    private BestBuyHome bestBuyHome;

    @Given("I am on the Best Buy home page")
    public void iAmOnTheBestBuyHomePage() {

    }

    @When("I close the add modal and search for 'macbook pro'")
    public void iCloseTheAddModalAndSearchForMacbookPro() {
        
    }

    @Then("One of the laptops listed should be 13.3 8GB Memory and 256GB SSD")
    public void oneOfTheLaptopsListedShouldBeGBMemoryAndGBSSD() {

    }

    @Given("I perform the above search")
    public void iPerformTheAboveSearch() {
        Assert.assertEquals("\"macbook pro\"", bestBuyHome.getSearchResultsLabel().getText());
    }

    @When("I click the 'Add to Cart' button next to the laptop")
    public void iClickTheAddToCartButtonNextToTheLaptop() {
        bestBuyHome.getAddToCartButton().click();
    }

    @Then("I should see a modal window with the cart subtotal")
    public void iShouldSeeAModalWindowWithTheCartSubtotal() {
        // Switch to modal
        bestBuyHome.switchToCartSubtotalModal();

        // Check modal for cart subtotal label
        String cartSubtotalLabel = bestBuyHome.getCartSubtotalLabel().getText();
        Assert.assertTrue(cartSubtotalLabel.contains("Subtotal"));

        // Check cart subtotal price in modal
        Assert.assertEquals("$1,099.99", bestBuyHome.getCartSubtotalPrice());
    }

    @Given("I am on the above modal page")
    public void iAmOnTheAboveModalPage() {
        
    }

    @When("I click on the 'Go to Cart' button")
    public void iClickOnTheGoToCartButton() {
        
    }

    @Then("I should see the laptop and the order summary with Total price")
    public void iShouldSeeTheLaptopAndTheOrderSummaryWithTotalPrice() {
        
    }

    @Given("I am on the above page")
    public void iAmOnTheAbovePage() {
        
    }

    @When("I click the 'Remove' link under the item number drop down")
    public void iClickTheRemoveLinkUnderTheItemNumberDropDown() {
        
    }

    @Then("I my anonymous cart should be empty")
    public void iMyAnonymousCartShouldBeEmpty() {

    }
}
