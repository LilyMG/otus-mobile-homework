package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class MessagesPage extends AbsBasePage<MessagesPage> {

    private final ElementsCollection textViews = $$(By.className("android.widget.TextView"));

}
