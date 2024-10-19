package pages;

import com.codeborne.selenide.Selenide;

public class AbsBasePage<T> {
    public T open() {
        Selenide.open();
        return (T) this;
    }
}
