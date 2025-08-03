import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.AlertDialog;
import pages.MainPage;
import pages.MessagesPage;


@ExtendWith(AppiumExtension.class)

public class Messages_Test {
    @Inject
    private MainPage mainPage;
    @Inject
    private AlertDialog dialog;
    @Inject
    private MessagesPage messagesPage;
    /**
     * test case checks creationOfMessages
     * open application
     */
    @Test
    public void checkCreationOfMessages() {
        String messageToSend = "hello world";
        //TODO here we need a helper to get how many banners are shown to the user to make clicks accordingly
        int amountOfPages = 3;
        mainPage.open();
        mainPage.isSkipVisible(false);
        for (int i = 0; i < amountOfPages - 1; i++) {
            mainPage.clickOnNext();
        }
        mainPage.isSkipVisible(true);
        mainPage.clickOnSkip();
        dialog.close();
        messagesPage.setMessage(messageToSend);
        messagesPage.sendMessage();
        messagesPage.isMessageSend(messageToSend);
        //WebDriverRunner.getWebDriver().getPageSource()
    }




}
