import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


@ExtendWith(AppiumExtension.class)

public class Andy_Test {


    @Inject
    private MainPage mainPage;

    @Test
    public void testAndroidTap() {
        //TODO here we need a helper to get how many banners are shown to the user to make clicks accordingly
        int amountOfPages = 3;
        mainPage.open();
        for (int i = 0; i < amountOfPages -1 ; i++) {
            mainPage.clickOnNext();
        }
        mainPage.isSkipVisible(true);
        System.out.println(mainPage.toString());
    }

}
