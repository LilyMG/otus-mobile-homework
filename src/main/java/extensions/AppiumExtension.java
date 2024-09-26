package extensions;

import com.google.inject.Guice;
import com.google.inject.Injector;
import drivers.DriverFactory;
import modules.PageGuiceModule;
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
