package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class Base {

     @FindBy(xpath = "//span[@class='sc-1or3vea-15 bMjnfo']")
    private WebElement globalSearchBar;

    @FindBy(xpath = "//div[@class='sc-1or3vea-19 bfNncl']/a")
    private WebElement globalOptionsMenu;
   
    @FindBy(id = "dummy")
    private WebElement searchYourCity;

    @FindBy(xpath = "//div[@class='sc-5d56x9-0 hIDoFD']")
    private List<WebElement> dynamicCitySuggestion;

    @FindBy(xpath = "//span[@class='sc-1or3vea-16 gPcyDI']")
    private WebElement selectedLocation;


    public Base(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectSearchedCity(String finalCity, String city, WebDriver driver) throws InterruptedException {
        enterCityInSearchBar(city, driver);
        Thread.sleep(1000);
        for (WebElement cityOption : dynamicCitySuggestion) {
            WebElement targetElement = driver.findElement(with(By.className("sc-5d56x9-2 bVrGxE")).below(cityOption));
            if (targetElement.getText().equalsIgnoreCase(finalCity)) {
                targetElement.click();
                break;
            } 
        }
    }

    public void enterCityInSearchBar(String city, WebDriver driver) {
        globalSearchBar.clear();
        globalSearchBar.sendKeys(city);
    }

    public String getSelectedLocation() {
        return selectedLocation.getText();
    }
}