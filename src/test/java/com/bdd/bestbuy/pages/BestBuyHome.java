package com.bdd.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class BestBuyHome {
    private String url = "https://www.bestbuy.com/";
    WebDriver driver;

    /*** General ***/

    public BestBuyHome(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);
    }

    public void waitForPageLoad(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public void Quit() {
        driver.quit();
    }

    /*** Paul Cha ***/


    /*** Rinay Kumar ***/

    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/div/div/button"));
    }

    public void switchToCartSubtotalModal() {
        driver.switchTo().activeElement();
    }

    public WebElement getCartSubtotalLabel() {
        return driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]"));
    }

    /*** Kwabena Bamfo ***/


    /*** Sheena Mathew ***/

}
