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

    public void Quit() {
        driver.quit();
    }
}
