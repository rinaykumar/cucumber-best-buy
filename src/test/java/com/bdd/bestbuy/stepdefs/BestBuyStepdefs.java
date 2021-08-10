package com.bdd.bestbuy.stepdefs;

import com.bdd.bestbuy.pages.BestBuyHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BestBuyStepdefs {

    private BestBuyHome bestBuyHome;

    @Given("I am on the Best Buy home page")
    public void iAmOnTheBestBuyHomePage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        bestBuyHome = new BestBuyHome(driver);
    }

    @When("I close the add modal and search for 'macbook pro'")
    public void iCloseTheAddModalAndSearchForMacbookPro() throws InterruptedException {
        bestBuyHome.closeModal();
        Thread.sleep(1000);
        bestBuyHome.getSearchBar().sendKeys("macbook pro");
        bestBuyHome.submitSearch().click();
        Thread.sleep(10000);
    }

    @Then("One of the laptops listed should be 13.3 8GB Memory and 256GB SSD")
    public void oneOfTheLaptopsListedShouldBeGBMemoryAndGBSSD() {
        String macBookDescription = bestBuyHome.getMacbookModel();
        Assert.assertEquals("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray" , macBookDescription );
        bestBuyHome.Quit();
    }

    @Given("I perform the above search")
    public void iPerformTheAboveSearch() {
        
    }

    @When("I click the 'Add to Cart' button next to the laptop")
    public void iClickTheAddToCartButtonNextToTheLaptop() {
        
    }

    @Then("I should see a modal window with the cart subtotal")
    public void iShouldSeeAModalWindowWithTheCartSubtotal() {
        
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
