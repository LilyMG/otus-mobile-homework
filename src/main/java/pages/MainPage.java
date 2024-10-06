package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import java.beans.Visibility;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.appium.SelenideAppium.$;

public class MainPage extends AbsBasePage<MainPage> {

    private ElementsCollection textViews = $$(By.className("android.widget.TextView"));

    public void clickOnNext() {
        textViews.filterBy(Condition.text("next")).first().shouldBe(Condition.visible).click();
    }

    public void isSkipVisible(boolean isVisible) {
        int expectedSize = isVisible ? 1 : 0;
        textViews.
                filter(Condition.text("skip")).
                shouldHave(size(expectedSize));
    }

}
