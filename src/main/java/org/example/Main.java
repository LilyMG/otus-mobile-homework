package org.example;

import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.Configuration;
import providers.SelenideWebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;

//import static io.appium.java_client.remote.MobileCapabilityType.*;
//import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Main {

    @Test
    void testAndroidTap() {
        Configuration.browser = SelenideWebDriver.class.getName();
        SelenideAppium.launchApp();
        $(AppiumBy.xpath(".//*[@text='Views']")).shouldBe(visible).click(tap());
        $(AppiumBy.xpath(".//*[@text='Animation']")).shouldBe(visible);
    }

    @Test
    public void test() {
//        Map<String, Object> selenoidOptions = new HashMap<>();
//        selenoidOptions.put("browserName", "chrome");
//        selenoidOptions.put("browserVersion", "100.0");
//        selenoidOptions.put("enableVNC", true);
//        selenoidOptions.put("enableVideo", false);
//        selenoidOptions.put("deviceName", "Samsung Galaxy S6");
//        selenoidOptions.put("app", "app.apk");
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setCapability("selenoid:options", selenoidOptions);

//
//        try {
//            new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }

    }
}