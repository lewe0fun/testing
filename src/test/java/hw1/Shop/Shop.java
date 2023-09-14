package hw1.Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        List<Product> productList = new ArrayList<>(products);
        for (int i = 0; i < productList.size() - 1; i++) {
            for (int j = 0; j < productList.size() - i - 1; j++) {
                if (productList.get(j + 1).getCost() < productList.get(j).getCost()) {
                    Product swap = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, swap);
                }
            }
        }
        return productList;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        List<Product> sortedProducts = sortProductsByPrice();
        return sortedProducts.get(sortedProducts.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("costs:");
        for (Product p : products)
            result.append(" ").append(p.getCost());
        return result.toString();
    }
}