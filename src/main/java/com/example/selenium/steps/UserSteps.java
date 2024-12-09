package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage securedPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        // TODO initialize LoginPage, call setUsername, setPassword, and click login methods
        LoginPage loginPage = new LoginPage(driver);
        securedPage = loginPage.setUsername(username)
                               .setPassword(password)
                               .clickLogin();
        //  TODO assert title
        assertEquals(securedPage.getTitle(), "Secure Area", "Login failed!");
        return this;
    }

    public UserSteps logout() {
        // TODO call logout method
        loginPage = securedPage.clickLogout();
        return this;
    }

    public UserSteps checkThatAtLoginPage() {
        assertEquals(loginPage.getTitle(), "Login Page", "Login page is not loaded!");
        return this;
    }
}
