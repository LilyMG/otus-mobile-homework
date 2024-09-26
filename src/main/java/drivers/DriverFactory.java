package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class DriverFactory {

    private static AppiumDriver<MobileElement> driver = null;

    public static AppiumDriver<MobileElement> getAndroidDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(APP, "/Users/lilittevosyan/Documents/dev/autoProjects/otus-mobile-no-5/src/main/resources/app.apk");
        desiredCapabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");

        try {
            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    public static AppiumDriver<MobileElement> getIosDriver() {
        return null;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
