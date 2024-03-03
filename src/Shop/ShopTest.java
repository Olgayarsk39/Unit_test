package Shop;



import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */



    public static void main(String[] args) {
        testGetProduts();
        testGetMostExpensiveProduct ();
        testSortProductsByPrice ();
    }

        public static void testGetProduts () {
            //   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
            //   (правильное количество продуктов, верное содержимое корзины).
            Shop shop = new Shop();
            List<Product> products = new ArrayList<>();
            products.add(new Product(102, "apple"));
            products.add(new Product(200, "tomato"));
            products.add(new Product(25, "water"));
            shop.setProducts(products);
            List<Product> actualProducts = shop.getProducts();
            assertThat(actualProducts.size()).isEqualTo(products.size());
            assertThat(actualProducts).containsAll(products);
           // assertEquals(products.size(), actualProducts.size());
           // assertTrue(actualProducts.containsAll(products));
        }

        //   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.

        public static void testGetMostExpensiveProduct () {
            Shop shop = new Shop();
            List<Product> products = new ArrayList<>();
            products.add(new Product(102, "apple"));
            products.add(new Product(200, "tomato"));
            products.add(new Product(25, "water"));
            shop.setProducts(products);

            Product mostExpensiveProduct = shop.getMostExpensiveProduct();
            assertThat(mostExpensiveProduct.getCost()).isEqualTo(200);
            assertThat(mostExpensiveProduct.getTitle()).isEqualTo("tomato");

         //   assertEquals(200, mostExpensiveProduct.getCost());
          //  assertEquals("tomato", mostExpensiveProduct.getTitle());
        }

        // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).


        public static void testSortProductsByPrice () {
            Shop shop = new Shop();
            List<Product> products = new ArrayList<>();
            products.add(new Product(102, "apple"));
            products.add(new Product(200, "tomato"));
            products.add(new Product(25, "water"));

            shop.setProducts(products);

            List<Product> sortedProducts = shop.sortProductsByPrice();

            assertThat(sortedProducts.get(0).getCost()).isEqualTo(25);
            assertThat(sortedProducts.get(1).getCost()).isEqualTo(102);
            assertThat(sortedProducts.get(2).getCost()).isEqualTo(200);

          /*  assertEquals(25,
                    sortedProducts.get(0).getCost());
            assertEquals(102,
                    sortedProducts.get(1).getCost());
            assertEquals(200,
                    sortedProducts.get(2).getCost());*/
        }
}