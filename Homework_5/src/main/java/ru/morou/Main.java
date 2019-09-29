package ru.morou;

import ru.morou.observer.*;

public class Main {
    public static void main(String[] args) {
        CreditSubject credit = new CreditSubject();
        DepositSubject deposit = new DepositSubject();

        Observer director = new DirectorObserver ();
        Observer manager = new ManagerObserver ();

        credit.attach(manager);
        credit.attach(director);

        deposit.attach(manager);

        System.out.println("Заявка на кредит:");
        credit.createOrder();
        System.out.println("Заявка на открытие депозита:");
        deposit.createOrder();

        System.out.println("Заявка отправлена на скоринг:");
        credit.sendToScoring();
    }
}
