package ru.morou.product;

import ru.morou.product.products.Product;

import java.util.HashMap;

public interface AbstractProductFactory {
    Product createProduct(ProductType productType, HashMap<Enum, String> productProperty);
}
