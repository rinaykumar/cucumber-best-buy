package com.bdd.bestbuy.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BestBuyHome {

    private String url = "https://www.bestbuy.com/";
    WebDriver driver;

    public BestBuyHome(WebDriver driver) {
        this.driver = driver;
        this.driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

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

    public void closeAccountModal(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/header/div[2]/nav/ul/li[1]/div/div/button/svg")).click();
    }

    public void Quit() {
        driver.quit();
    }
}
