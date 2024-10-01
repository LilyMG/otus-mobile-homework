package org.example;

import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)
public class Main {

    @Inject
    private MainPage mainPage;

    @Test
    public void testAndroidTap() {
        System.out.println(mainPage.toString());


//
//
//        Capabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability(PLATFORM_NAME, "Android");
////        capabilities.setCapability(DEVICE_NAME, "emulator-5554");
////        capabilities.setCapability(APP, "/Users/lilittevosyan/Documents/dev/autoProjects/otus-mobile-no-5/src/main/resources/app-debug.apk");
////        capabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");
//
//        new SelenideWebDriver().createDriver(capabilities);
//        Configuration.browser = SelenideWebDriver.class.getName();
//        SelenideAppium.launchApp();
//        $(AppiumBy.xpath(".//*[@text='Views']")).shouldBe(visible).click(tap());
//        $(AppiumBy.xpath(".//*[@text='Animation']")).shouldBe(visible);
    }

//    public static void main(String[] args) {
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(PLATFORM_NAME, "Android");
//        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554");
//        desiredCapabilities.setCapability(APP, "/Users/lilittevosyan/Documents/dev/autoProjects/otus-mobile-no-5/src/main/resources/app-debug.apk");
//        desiredCapabilities.setCapability(AUTOMATION_NAME, "UiAutomator2");
//
//        AppiumDriver<MobileElement> driver;
//        try {
//            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Hello world!");
//    }

}