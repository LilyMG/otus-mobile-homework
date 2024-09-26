package extensions;

import drivers.DriverFactory;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AppiumExtension implements BeforeEachCallback, AfterEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        DriverFactory.getAndroidDriver();
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        DriverFactory.quitDriver();
    }
}
