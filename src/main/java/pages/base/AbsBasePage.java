package pages.base;

import commons.AbsCommonObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public abstract class AbsBasePage<T> extends AbsCommonObject<T> {
    public AbsBasePage(AppiumDriver driver) {
        super(driver);
    }

}
