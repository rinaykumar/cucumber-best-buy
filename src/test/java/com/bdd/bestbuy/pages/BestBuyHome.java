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

    public void Quit() {
        driver.quit();
    }

    /*** Paul Cha ***/

    public WebElement getSearchBar(){
        return driver.findElement(By.id("gh-search-input"));
    }

    public WebElement submitSearch(){
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/header/div[1]/div/div[1]/div/form/button[2]"));
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
    
    
    public WebElement iClickOnTheGoToCartButton() {
        // Click go to cart button
       return driver.findElement(By.linkText("Go to Cart"));
    }

   /*
    public void iShouldSeeTheLaptopAndTheOrderSummaryWithTotalPrice() {
        String macbookInfo = "MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray";

        // Wait for page to load
        bestBuyHome.waitForPageLoad(5);

        // Assert macbookInfo with label from page
        Assert.assertEquals(driver.findElement(By.partialLinkText("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray")).getText(), macbookInfo);
        // Assert "Order Summary" label appears on page
        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Order Summary')]")).getText(), "Order");
        // Assert "Total" label appears on page
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'Total')]")).getText(), "Total");
        // Quit driver
        bestBuyHome.Quit();
    }
    */
     public WebElement getLaptopInfo() {
        // Click go to cart button
       return driver.findElement(By.partialLinkText("MacBook Pro 13.3\" Laptop - Apple M1 chip - 8GB Memory - 256GB SSD (Latest Model) - Space Gray"));
    }

     public WebElement getOrderLabel() {
        // Click go to cart button
        return driver.findElement(By.xpath("//h2[contains(text(),'Order Summary')]"));
    }

     public WebElement getTotalLabel() {
        // Click go to cart button
       return driver.findElement(By.xpath("//span[contains(text(),'Total')]"));
    }



    /*** Sheena Mathew ***/

}
