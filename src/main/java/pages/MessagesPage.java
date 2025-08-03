package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.appium.selector.ByContentDescription;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.AppiumSelectors.byContentDescription;
import static com.codeborne.selenide.appium.SelenideAppium.$;

public class MessagesPage extends AbsBasePage<MessagesPage> {

    private final ElementsCollection textViews = $$(By.className("android.widget.TextView"));
    private final SelenideElement messageEditText =  $(byContentDescription("Type a message..."));
    private final SelenideElement sendMessage =  $(byContentDescription("send"));

    public void setMessage(String s) {
        messageEditText.setValue(s);
    }

    public void sendMessage() {
        sendMessage.click();
    }

    public void isMessageSend(String s){
        textViews.filterBy(Condition.text(s)).first().shouldBe(Condition.visible);
    }
}
