package ru.netology.page;

import ru.netology.data.DataUser;

import static com.codeborne.selenide.Selenide.$;

public class PageLogin {
    public PageVer validLogin(DataUser.AutInfo autInfo) {
        $("[data-test-id = login] input").setValue(autInfo.getLogin());
        $("[data-test-id = password] input").setValue(autInfo.getPassword());
        $("[data-test-id = action-login] .button__content").click();
        return new PageVer();
    }
}
