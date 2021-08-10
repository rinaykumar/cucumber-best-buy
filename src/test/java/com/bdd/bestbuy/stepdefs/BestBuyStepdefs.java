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

    @Given("I am on the Best Buy home page")
    public void iAmOnTheBestBuyHomePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        bestBuyHome = new BestBuyHome(driver);
    }

    @When("I close the add modal and search for 'macbook pro'")
    public void iCloseTheAddModalAndSearchForMacbookPro() {
        bestBuyHome.waitForPageLoad(10);
        bestBuyHome.getAddModalCloseButton().click();
        bestBuyHome.getSearchBar().click();
        bestBuyHome.getSearchBar().sendKeys("macbook pro");
        bestBuyHome.getSearchButton().click();
    }

    @Then("One of the laptops listed should be 13.3 8GB Memory and 256GB SSD")
    public void oneOfTheLaptopsListedShouldBeGBMemoryAndGBSSD() {
        Assert.assertEquals("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray", bestBuyHome.getMacBookInfo().getText());
        bestBuyHome.Quit();
    }

    @When("I click the 'Add to Cart' button next to the laptop")
    public void iClickTheAddToCartButtonNextToTheLaptop() {
        bestBuyHome.waitForPageLoad(15);
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

        bestBuyHome.Quit();
    }

    @When("I click on the 'Go to Cart' button")
    public void iClickOnTheGoToCartButton() {
        bestBuyHome.getGoToCartButton().click();
        bestBuyHome.waitForPageLoad(5);
    }

    @Then("I should see the laptop and the order summary with Total price")
    public void iShouldSeeTheLaptopAndTheOrderSummaryWithTotalPrice() {
        Assert.assertEquals("Order Summary", bestBuyHome.getOrderSummaryLabel().getText());
        Assert.assertEquals("Total", bestBuyHome.getTotalLabel().getText());
        bestBuyHome.Quit();
    }

    @When("I click the 'Remove' link under the item number drop down")
    public void iClickTheRemoveLinkUnderTheItemNumberDropDown() {
        bestBuyHome.getRemoveLink().click();
    }

    @Then("I my anonymous cart should be empty")
    public void iMyAnonymousCartShouldBeEmpty() {
        Assert.assertEquals("Your cart is empty", bestBuyHome.getCartIsEmptyLabel().getText());
        bestBuyHome.Quit();
    }
}
