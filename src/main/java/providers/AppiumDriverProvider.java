package providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class AppiumDriverProvider implements Provider<AppiumDriver> {


    @Inject
    public AppiumDriverProvider() {
    }

    @Override
    public AppiumDriver get() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(PLATFORM_NAME, "Android");
            capabilities.setCapability(DEVICE_NAME, "emulator-5554");
            capabilities.setCapability(APP, "/Users/lilittevosyan/Documents/dev/autoProjects/otus-mobile-no-5/src/main/resources/app.apk");
            capabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");
            return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Failed to create Appium driver", e);
        }
    }
}
