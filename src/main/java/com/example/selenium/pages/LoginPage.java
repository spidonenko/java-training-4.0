package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(css = "#content > div.example > h2")
    private WebElement title;
    @FindBy(id = "username")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(css = "form#login > button[type='submit']")
    private WebElement submitBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return title.getText();
    }

    public LoginPage setUsername(String text) {
        // TODO set username
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // TODO set password
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // TODO click logout return instance of MainPage
        submitBtn.click();
        return new MainPage(driver);
    }
}
