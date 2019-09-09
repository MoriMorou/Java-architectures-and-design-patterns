package ru.morou.product.products;

import ru.morou.product.util.PropertyKey;
import java.util.HashMap;

public class Credit implements Product {
    private int creditSum;
    private int creditPeriod;
    private float creditPercent;

    public Credit(HashMap<Enum, String> productProperty) {
        this.creditSum = Integer.parseInt(productProperty.get(PropertyKey.SUM));
        this.creditPeriod = Integer.parseInt(productProperty.get(PropertyKey.PERIOD));
        this.creditPercent = Float.parseFloat(productProperty.get(PropertyKey.PERCENT));
    }

    @Override
    public void showInfo() {
        System.out.println("Тип продукт: кредит, сумма: " + creditSum + " руб., период: " + creditPeriod + " дн., ставка: " + creditPercent + "%");
    }
}
