package hw1.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {

        //List<Product> productList = Arrays.asList(new Product(50, "water"), new Product(100, "coffee"), new Product(25, "tie"), new Product(5, "salt"));
        List<Product> productList = new ArrayList<>();
        Product a = new Product(50, "water");
        Product b = new Product(100, "coffee");
        Product c = new Product(25, "tie");
        Product d = new Product(5, "salt");
        productList.add(a);
        productList.add(b);
        productList.add(c);
        productList.add(d);
        Shop shop = new Shop();
        shop.setProducts(productList);

//правильное количество продуктов
        assertThat(productList).hasSize(4);
//верное содержимое корзины
        assertThat(productList).contains(a, b, c, d);
//тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(100);
//тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
        List<Product> sortedList = shop.sortProductsByPrice();
        assertThat(sortedList).isSorted();
    }
}