package org.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
//import extensions.AppiumExtension;
import modules.AppiumModule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.base.BannerPage;

//@ExtendWith({UIExtensions.class})
public class Main {
    Injector injector = Guice.createInjector(new AppiumModule());
    @Inject
    BannerPage bannerPage = injector.getInstance(BannerPage.class);


    @Test
    public void test() {
        bannerPage.clickNextBtn();
        System.out.println("hello");
    }
}