package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(css = "#content > div.example > h2")
    private WebElement title;
    @FindBy(css = "#content a[href='/logout']")
    private WebElement logoutBtn;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        // TODO return title text
        return title.getText();
    }

    public LoginPage clickLogout() {
        // TODO click logout and return MainPage
        logoutBtn.click();
        // this is already MainPage.
        //      Maybe here method must return LoginPage, because after logging out user leaves the MainPage
        return new LoginPage(driver);
    }
}
