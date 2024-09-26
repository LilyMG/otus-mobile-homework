package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class Main {

    @Test
    public void test() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(APP, "/Users/lilittevosyan/Documents/dev/autoProjects/otus-mobile-no-5/src/main/resources/app-debug.apk");
        desiredCapabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");

        AppiumDriver<MobileElement> driver;
        try {
            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}