package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import pages.AlertDialog;
import pages.MainPage;

public class GuiceModule extends AbstractModule {

    @Singleton
    @Provides
    public MainPage createMainPage() {
        return new MainPage();
    }

    @Singleton
    @Provides
    public AlertDialog createDialog() {
        return new AlertDialog();
    }
}
