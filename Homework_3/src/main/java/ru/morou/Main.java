package ru.morou;

import ru.morou.product.AbstractProductFactory;
import ru.morou.product.ProductFactory;
import ru.morou.product.ProductType;
import ru.morou.product.products.Product;
import ru.morou.product.util.PropertyKey;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AbstractProductFactory factory = new ProductFactory();

        //создаём продукты
        //кредит
        HashMap<Enum, String> productProperty = new HashMap<>();
        productProperty.put(PropertyKey.SUM, "200000");
        productProperty.put(PropertyKey.PERIOD, "180");
        productProperty.put(PropertyKey.PERCENT, "19.0");
        Product credit = factory.createProduct(ProductType.CREDIT, productProperty);

        //вклад
        productProperty = new HashMap<>();
        productProperty.put(PropertyKey.SUM, "150000");
        productProperty.put(PropertyKey.PERIOD, "360");
        productProperty.put(PropertyKey.PERCENT, "5.45");
        Product deposit = factory.createProduct(ProductType.DEPOSIT, productProperty);

        //страховка
        productProperty = new HashMap<>();
        productProperty.put(PropertyKey.SUM, "50000");
        productProperty.put(PropertyKey.PERIOD, "120");
        Product insurance = factory.createProduct(ProductType.INSURANCE, productProperty);

        //вывод информации
        credit.showInfo();
        deposit.showInfo();
        insurance.showInfo();
    }
}
