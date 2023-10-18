package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PageDashboard {
    private SelenideElement header = $("[data-test-id = dashboard]");

    public PageDashboard() {
        header.shouldBe(visible);
        header.shouldHave(text("Личный кабинет"));
    }
}
