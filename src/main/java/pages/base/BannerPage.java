package pages.base;

import com.google.inject.Inject;
import com.google.inject.Provides;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BannerPage extends AbsBasePage<BannerPage> {


    @Inject
    public BannerPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "next_button_id")  // Specify the correct ID here
    private MobileElement nextBtn;

    public BannerPage clickNextBtn() {
        nextBtn.click();
        return this;
    }
}
