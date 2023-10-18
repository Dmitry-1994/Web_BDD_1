package ru.netology.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataUser;
import ru.netology.page.PageLogin;
import ru.netology.page.PageTransit;
import ru.netology.page.PageVer;

import static com.codeborne.selenide.Selenide.*;

public class TransferTest {

    @BeforeEach
    void startSetup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void positiveCase() {
        var loginPage = new PageLogin();
        var autInfo = DataUser.getAutInfo();
        var loginVer = loginPage.validLogin(autInfo);
        var verCode = DataUser.getVerCode(autInfo);
        loginVer.validVer(verCode);
        var transitPage = new PageTransit();
        transitPage.addFirstCard();

    }
}
