package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class AlertDialog extends AbsBaseComponent<AlertDialog> {

    private final SelenideElement message = $(By.id("android:id/message"));
    private final SelenideElement okBtn = $(By.id("android:id/button1"));

    public void messageIs(String text) {
        message.shouldBe(Condition.visible).shouldBe(Condition.text(text));
    }

    public void close() {
        okBtn.click();
    }

}
