package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataUser;

import static com.codeborne.selenide.Selenide.*;

public class PageTransit {
    private SelenideElement nextOne = $("[data-test-id = '92df3f1c-a033-48e6-8390-206f6b1f56c0'] [data-test-id = action-deposit]");
    private SelenideElement nextTwo = $("[data-test-id = '92df3f1c-a033-48e6-8390-206f6b1f56c0'] [data-test-id = action-deposit]");
    private SelenideElement amount = $("[data-test-id = amount] input");
    private SelenideElement from = $("[data-test-id = from] input");

    public void addFirstCard() {
        var infoCard = DataUser.getInfoCard(2);
        nextOne.click();
        amount.setValue("200");
        from.setValue(infoCard.getNumber());


    }

    public void addSecondCard() {
        nextTwo.click();
    }
}
