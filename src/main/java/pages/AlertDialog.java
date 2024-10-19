package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class AlertDialog extends AbsBaseComponent<AlertDialog> {

    private final SelenideElement message = $(By.id("android:id/message"));

    public void messageIs(String text) {
        message.shouldBe(Condition.visible).shouldBe(Condition.text(text));
    }

}
