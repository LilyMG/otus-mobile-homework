package pages.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BannerPage extends AbsBasePage<BannerPage> {

    public BannerPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private MobileElement nextBtn;

}
