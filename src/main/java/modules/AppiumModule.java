package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import pages.base.BannerPage;
import providers.AppiumDriverProvider;

public class AppiumModule extends AbstractModule {
    private final String platform;


    public AppiumModule(String platform) {
        this.platform = platform;
    }

    @Override
    protected void configure() {
        bind(AppiumDriver.class).toProvider(AppiumDriverProvider.class);
        bind(String.class).toInstance(platform);
        bind(BannerPage.class);
    }


    @Provides
    public AppiumDriver getDriver() {
        AppiumDriverProvider appiumDriverProvider = new AppiumDriverProvider("android");
        return appiumDriverProvider.get();
    }


    @Provides
    public BannerPage provideBannerPage(AppiumDriver driver) {
        return new BannerPage(driver);
    }

}
