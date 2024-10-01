package pages;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumDriver;

public class MainPage extends AbsBasePage <MainPage>{

    public MainPage open(){
        Selenide.open();
        return this;
    }
}
