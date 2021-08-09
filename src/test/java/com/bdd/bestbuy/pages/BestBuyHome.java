package com.bdd.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestBuyHome {
    private String url = "https://www.bestbuy.com/";
    WebDriver driver;

    public BestBuyHome(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);
    }

    public WebElement getSearchResultsLabel() {
        return driver.findElement(By.className("search-title"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("//*[@id='fulfillment-add-to-cart-button-96125401']/div/div/div/button"));
    }

    public void switchToCartSubtotalModal() {
        driver.switchTo().activeElement();
    }

    public WebElement getCartSubtotalLabel() {
        return driver.findElement(By.xpath("//*[@id='shop-cart-subtotal-61265006']/div/div/div[1]"));
    }

    public WebElement getCartSubtotalPrice() {
        return driver.findElement(By.xpath("//*[@id='shop-cart-subtotal-61265006']/div/div/div[2]"));
    }

    public void Quit() {
        driver.quit();
    }
}
