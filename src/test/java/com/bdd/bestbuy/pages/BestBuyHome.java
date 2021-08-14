package com.bdd.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class BestBuyHome {
    WebDriver driver;

    /*** General ***/

    public BestBuyHome(WebDriver driver){
        this.driver = driver;
        String url = "https://www.bestbuy.com/";
        this.driver.get(url);
    }

    public void waitForPageLoad(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public void dismissModals() {
        boolean isSurvey = driver.findElements(By.id("survey_window")).size() > 0;
        boolean isGifts = driver.findElements(By.className("gifts-with-purchase-content")).size() > 0;

        if (isSurvey)
            driver.findElement(By.id("survey_invite_no")).click();

        if (isGifts)
            driver.findElement(By.id("gh-search-input")).click();
    }

    public void Quit() {
        driver.quit();
    }

    /*** Paul Cha ***/

    public WebElement getSearchBar(){
        return driver.findElement(By.id("gh-search-input"));
    }

    public WebElement submitSearch(){
        return driver.findElement(By.className("header-search-button"));
    }

    public void closeModal(){
        driver.findElement(By.xpath("/html/body/main/div[2]/div[5]/div/div/div[1]/div/div/div/div/button")).click();
    }

    public String getMacbookModel(){
        return driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div/h4/a")).getText();
    }

    /*** Rinay Kumar ***/

    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/div/div/button"));
    }

    public Boolean isAddToCartError() {
        return driver.findElements(By.className("c-alert")).size() > 0;
    }

    public void switchToCartSubtotalModal() {
        driver.switchTo().activeElement();
    }

    public WebElement getCartSubtotalLabel() {
        return driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]"));
    }

    /*** Kwabena Bamfo ***/

    public WebElement getGoToCartButton() {
        return driver.findElement(By.linkText("Go to Cart"));
    }

    public WebElement getLaptopInfo() {
        return driver.findElement(By.partialLinkText("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray"));
    }

    public WebElement getOrderLabel() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Order Summary')]"));
    }

    public WebElement getTotalLabel() {
        return driver.findElement(By.xpath("//span[contains(text(),'Total')]"));
    }

    /*** Sheena Mathew ***/

    public WebElement getRemoveButton() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[1]/section[1]/div[4]/ul/li/section/div[2]/div[3]/a[1]"));
    }

    public WebElement getEmptyCart() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[1]/div[1]/section[1]/div[1]/div/h1"));
    }
}
