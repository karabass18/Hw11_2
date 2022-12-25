package com.karabass18;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class StartSet {

    @BeforeAll
    static void startSet() {

        Configuration.browserSize = "1920x1080";

    }
}
