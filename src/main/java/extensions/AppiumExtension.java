package extensions;

import com.codeborne.selenide.Configuration;
import com.google.inject.Guice;
import modules.GuiceModule;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import providers.SelenideWebDriver;

public class AppiumExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        Configuration.browserSize = null;
        Configuration.browser = SelenideWebDriver.class.getName();
        Guice.createInjector(new GuiceModule()).injectMembers(context.getTestInstance().get());
    }
}
