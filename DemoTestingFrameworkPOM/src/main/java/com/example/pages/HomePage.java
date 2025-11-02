package com.example.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    @FindBy(xpath = "//h2[@class='sc-7o7nez-0 KnxOF']")
    private List<WebElement> categoriesList;
    List<String> categories;

    @FindBy(xpath = "//h2[contains(text(),'Recommended Movies')]/ancestor::div[@class='sc-133848s-3 bbHlLd']/following-sibling::div/descendant::h3")
    private List<WebElement> recommendedMoviesList;
    List<String> recommendedMovies;
    
    @FindBy(xpath = "//h2[contains(text(),'Your Music Studio')]/ancestor::div[@class='sc-133848s-3 bbHlLd']/following-sibling::div/descendant::h3")
    private List<WebElement> yourMusicStudioList;
    List<String> yourMusicStudio;

    @FindBy(xpath = "//h2[contains(text(),'Outdoor Events')]/ancestor::div[@class='sc-133848s-3 bbHlLd']/following-sibling::div/descendant::h3")
    private List<WebElement> outdoorEventsList;
    List<String> outdoorEvents;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<String> getCategoriesList() {
        for (WebElement category : categoriesList) {
            categories.add(category.getText());
        }
        return categories;
    }

    public List<String> getRecommendedMoviesList() {
        for (WebElement movie : recommendedMoviesList) {
            recommendedMovies.add(movie.getText());
        }
        return recommendedMovies;
    }
    public List<String> getYourMusicStudioList() {
        for (WebElement music : yourMusicStudioList) {
            yourMusicStudio.add(music.getText());
        }
        return yourMusicStudio;
    }
    public List<String> getOutdoorEventsList() {
        for (WebElement event : outdoorEventsList) {
            outdoorEvents.add(event.getText());
        }
        return outdoorEvents;
    }
}