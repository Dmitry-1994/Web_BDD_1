package ru.netology.data;

import lombok.Value;

public class DataUser {

    @Value
    public static class AutInfo {
        private String login;
        private String password;

    }

    public static AutInfo getAutInfo() {
        return new AutInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String verCode;
    }

    public static VerificationCode getVerCode(AutInfo autInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class InfoCard {
        private String number;
        private String amount;
    }

    public static InfoCard getInfoCard (int number) {
        if (number == 1) {
            return new InfoCard("5559 0000 0000 0001", "10 000");
        }
        if (number == 2) {
            return new InfoCard("5559 0000 0000 0002", "10 000");
        }
        else {
            return new InfoCard("", "");
        }
    }


}
