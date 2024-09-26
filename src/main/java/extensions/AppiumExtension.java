package extensions;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import providers.SelenideWebDriver;

public class AppiumExtension implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        Configuration.browserSize = null;
        Configuration.browser = SelenideWebDriver.class.getName();

    }
}
