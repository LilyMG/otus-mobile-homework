import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)

public class Andy_Test {


    @Inject
    private MainPage mainPage;

    @Test
    public void testAndroidTap() {
        mainPage.open();

        System.out.println(mainPage.toString());
    }

}
