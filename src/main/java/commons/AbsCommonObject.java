package commons;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbsCommonObject<T> {

    protected AppiumDriver driver;

    public AbsCommonObject(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
