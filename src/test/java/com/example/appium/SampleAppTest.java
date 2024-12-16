package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static java.lang.System.getenv;
import static org.testng.Assert.assertEquals;

public class SampleAppTest {
    private AppiumDriverLocalService server;
    private AppiumDriver driver;
    private PageView view;

    @BeforeClass
    private void setUp() {
        String platform = getenv("APPIUM_DRIVER");
        platform = platform == null ? "ANDROID" : platform.toUpperCase();
        String path = System.getProperty("user.dir");

        if (platform.equals("ANDROID")) {
            var options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setDeviceName("80HBDPE223EB")  // using real device
                    .setAppActivity(".view.TextFields")
                    .setApp(Paths.get(path).resolve("ApiDemos-debug.apk").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort());
            server.start();
            driver = new AndroidDriver(server, options);

            ((InteractsWithApps) driver).activateApp("io.appium.android.apis");
        } else {
            var options = new XCUITestOptions()
                    .setPlatformName("iOS")
                    .setPlatformVersion("18.2")
                    .setAutomationName("XCuiTest")
                    .setDeviceName("iPhone SE (3rd generation)")
                    .setApp(Paths.get(path).resolve("TestApp.app.zip").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort());
            server.start();
            driver = new IOSDriver(server, options);
        }
        view = new PageView(driver);
    }

    @Test
    public void textFieldTest() {
        // TODO initialise PageView and set "text" to its textField
        String textToVerify = "text";
        view.setTextField(textToVerify);

        // TODO assert that textField equals to "text"
        assertEquals(view.getTextField(), textToVerify, "Wrong text!");
    }

    @Test
    public void intSumTest() {
        if (!getenv("APPIUM_DRIVER").equalsIgnoreCase("IOS")){
            throw new SkipException("This test is available only for iOS app");
        }
        view.setTextField("1").setTextFieldB("2").clickSumBtn();

        assertEquals(view.getAnswerLbl(), "3", "Wrong sum!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (server != null) {
            server.stop();
        }
    }
}
