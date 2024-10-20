import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.AlertDialog;
import pages.MainPage;


@ExtendWith(AppiumExtension.class)

public class Banner_Test {

    @Inject
    private MainPage mainPage;
    @Inject
    private AlertDialog dialog;

    /**
     * test case checks visibility of skip button
     * open application
     * check if skip button is invisible
     * click on next button until it reaches the end (get from helper how any banners user should see)
     * check if skip button is visible
     */
    @Test
    public void checkVisibilityOfSkipButton() {
        //TODO here we need a helper to get how many banners are shown to the user to make clicks accordingly
        int amountOfPages = 3;
        mainPage.open();
        mainPage.isSkipVisible(false);
        for (int i = 0; i < amountOfPages - 1; i++) {
            mainPage.clickOnNext();
        }
        mainPage.isSkipVisible(true);
    }


    /**
     * test case checks visibility of alert dialog
     * open application
     * check if skip button is invisible
     * click on next button until it reaches the end (get from helper how any banners user should see)
     * click on skip button
     * check if alert dialog is present
     */
    @Test
    public void checkVisibilityOfAlertDialog() {
        //TODO here we need a helper to get how many banners are shown to the user to make clicks accordingly
        int amountOfPages = 3;
        mainPage.open();
        for (int i = 0; i < amountOfPages - 1; i++) {
            mainPage.clickOnNext();
        }
        mainPage.clickOnSkip();
        dialog.messageIs("Failed to get push token for push notification!");
    }

}
