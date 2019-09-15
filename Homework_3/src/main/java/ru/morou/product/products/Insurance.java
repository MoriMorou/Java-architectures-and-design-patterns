package ru.morou.product.products;
import ru.morou.product.util.PropertyKey;
import java.util.HashMap;

public class Insurance implements Product {
    private int insuranceSum;
    private int insurancePeriod;

    public Insurance(HashMap<Enum, String> productProperty) {
        this.insuranceSum = Integer.parseInt(productProperty.get(PropertyKey.SUM));
        this.insurancePeriod = Integer.parseInt(productProperty.get(PropertyKey.PERIOD));
    }

    @Override
    public void showInfo() {
        System.out.println("Тип продукт: страховка, сумма: " + insuranceSum + " руб., период: " + insurancePeriod + " дн.");
    }
}
