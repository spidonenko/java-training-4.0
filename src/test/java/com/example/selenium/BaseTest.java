package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;

    @BeforeClass
    public void setUp() {
        // TODO initialize a driver, open login URL, resize windows, and initialize steps
        //      Using local browser here
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(840, 720));
        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        // TODO driver close and quit
        driver.close();
    }
}
