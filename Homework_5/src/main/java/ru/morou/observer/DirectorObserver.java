package ru.morou.observer;

import java.util.ArrayList;
import java.util.List;

public class DirectorObserver implements Observer {
    private List<String> directors;

    public DirectorObserver() {
        directors = new ArrayList<>();
        fillDirectorNames();
    }

    @Override
    public void update(String productName, String message) {
        for (int i = 0; i < directors.size(); i++) {
            System.out.println("Уважаемый "+ directors.get(i) + "! " + message + ". Продукт: " + productName + ". Просьба проконтролировать работу региональных менеджеров.");
        }
    }

    private void fillDirectorNames() {
        directors.add("Максим Игоревич");
    }
}