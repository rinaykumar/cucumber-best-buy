package com.bdd.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class BestBuyHome {
    private String url = "https://www.bestbuy.com/";
    WebDriver driver;

    public BestBuyHome(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);
    }

    public void waitForPageLoad(int sec) {
        driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public WebElement getAddModalCloseButton() {
        return driver.findElement(By.xpath("//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[1]/div/div/div/div/button"));
    }

    public WebElement getSearchBar() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/header/div[1]/div/div[1]/div/form/input[1]"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/header/div[1]/div/div[1]/div/form/button[2]"));
    }

    public WebElement getMacBookInfo() {
        return driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div/h4/a"));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.xpath("/html/body/div[4]/main/div[10]/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[6]/ol/li[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/div/div/button"));
    }

    public void switchToCartSubtotalModal() {
        driver.switchTo().activeElement();
    }

    public WebElement getCartSubtotalLabel() {
        return driver.findElement(By.xpath("/html/body/div[9]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[1]"));
    }

    public WebElement getGoToCartButton() {
        return driver.findElement((By.xpath("/html/body/div[9]/div/div[1]/div/div/div/div/div[1]/div[3]/a")));
    }

    public WebElement getOrderSummaryLabel() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[1]/section[2]/div/div/h2"));
    }

    public WebElement getTotalLabel() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[1]/section[2]/div/div/div[1]/div/div[6]/div[1]/span"));
    }

    public WebElement getRemoveLink() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[1]/section[1]/div[4]/ul/li/section/div[2]/div[3]/a[1]"));
    }

    public WebElement getCartIsEmptyLabel() {
        return driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div[1]/div[1]/section[1]/div[1]/div/h1"));
    }

    public void Quit() {
        driver.quit();
    }
}
