package org.example;

import com.codeborne.selenide.appium.SelenideAppium;
import com.google.inject.Inject;
import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AppiumExtension.class)
public class Main {

    @Inject
    private MainPage mainPage;

    @Test
    public void testAndroidTap() {
//        SelenideAppium.launchApp();

        System.out.println(mainPage.toString());
    }
}