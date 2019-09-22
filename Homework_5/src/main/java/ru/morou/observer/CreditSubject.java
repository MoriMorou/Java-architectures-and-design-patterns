package ru.morou.observer;

public class CreditSubject extends Subject {
    private static final String PRODUCT_NAME = "CREDIT";

    public void createOrder() {
        notifyUser(PRODUCT_NAME, "Была создана кредитная заявка");
    }

    public void sendToScoring() {
        notifyUser(PRODUCT_NAME, "Кредитная заявка отправлена на скоринг");
    }
}