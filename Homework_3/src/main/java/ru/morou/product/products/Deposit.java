package ru.morou.product.products;

import ru.morou.product.util.PropertyKey;
import java.util.HashMap;

public class Deposit implements Product {
    private int depositSum;
    private int depositPeriod;
    private float depositPercent;

    public Deposit(HashMap<Enum, String> productProperty) {
        this.depositSum = Integer.parseInt(productProperty.get(PropertyKey.SUM));
        this.depositPeriod = Integer.parseInt(productProperty.get(PropertyKey.PERIOD));
        this.depositPercent = Float.parseFloat(productProperty.get(PropertyKey.PERCENT));
    }

    @Override
    public void showInfo() {
        System.out.println("Тип продукт: вклад, сумма: " + depositSum + " руб., период: " + depositPeriod + " дн., ставка: " + depositPercent + "%");
    }
}
