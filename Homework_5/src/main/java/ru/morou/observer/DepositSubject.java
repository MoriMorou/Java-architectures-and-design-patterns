package ru.morou.observer;

public class DepositSubject extends Subject {
    private static final String PRODUCT_NAME = "DEPOSIT";

    public void createOrder() {
        notifyUser(PRODUCT_NAME, "Была создана заявка на открытие депозита");
    }
}