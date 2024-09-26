package org.example;

import extensions.AppiumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({AppiumExtension.class})
public class Main {
    @Test
    public void test() {
        System.out.println("hello");
    }
}