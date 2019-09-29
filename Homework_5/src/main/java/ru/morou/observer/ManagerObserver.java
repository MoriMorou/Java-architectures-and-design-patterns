package ru.morou.observer;

import java.util.ArrayList;
import java.util.List;

public class ManagerObserver implements Observer {
    private List<String> managers;

    public ManagerObserver() {
        managers = new ArrayList<>();
        fillManagerNames();
    }

    @Override
    public void update(String productName, String message) {
        for (int i = 0; i < managers.size(); i++) {
            System.out.println("Уважаемый " + managers.get(i) + "! " + message + ". Продукт: " + productName + ". Просьба приступить к обработке клиентских данных.");
        }
    }

    //список менеджеров
    private void fillManagerNames() {
        managers.add("Виктор Борисович");
        managers.add("Анатолий Петрович");
        managers.add("Виталий Дмитриевич");
    }
}