package com.karabass18;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class GithubSolutionTest extends StartSet {

    @Test
    @DisplayName("Проверка раздела Solution/Enterprise на Github")
    void githubTest01() {
        Configuration.baseUrl = "https://github.com";
        open("");
        $$(".HeaderMenu-link").filterBy(text("Solution")).first().hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(".col-9-max h1.h1-mktg").shouldHave(text("Build like the best"));

    }


    @Test
    @DisplayName("Проверка DragAndDrop")
    public void dragAndDropTest() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        open("");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
    }


}
