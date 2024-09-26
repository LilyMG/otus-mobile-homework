package org.example;

import drivers.DriverFactory;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    public void test() {
        DriverFactory.getAndroidDriver();

    }
}