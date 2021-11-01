package ru.job4j.tracker.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (products[index] == null) {
                ShopDrop.swap(products, i, index);
            } else {
                products[index] = null;
            }
        }
        return products;
    }

    public static Product[] swap(Product[] products, int p, int n) {
        Product temp = products[p];
        products[p] = products[n];
        products[n] = temp;
        return products;
    }
}
