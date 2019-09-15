package ru.morou.product;

import ru.morou.product.products.Credit;
import ru.morou.product.products.Deposit;
import ru.morou.product.products.Insurance;
import ru.morou.product.products.Product;

import java.util.HashMap;

public class ProductFactory implements AbstractProductFactory {
    @Override
    public Product createProduct(ProductType productType, HashMap<Enum, String> productProperty) {
        switch (productType) {
            case CREDIT:
                return new Credit(productProperty);
            case DEPOSIT:
                return new Deposit(productProperty);
            case INSURANCE:
                return new Insurance(productProperty);
            default:
                //throw new Exception("Не найден соответстующий тип продукта!");
                return null;
        }
    }
}
