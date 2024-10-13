package homework5.task3;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, int quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else {
            basket.put(product, quantity);
        }
    }

    public void removeProduct(String product) {
        basket.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
        } else {
            System.out.println("Продукт не найден в корзине.");
        }
    }

    public boolean isProductInBasket(String product) {
        return basket.containsKey(product);
    }

    void searchProduct(String product) {
        if (isProductInBasket(product)) {
            System.out.println("Есть!");
        } else {
            System.out.println("Нет!");
        }
    }

    public void displayBasket() {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Продукты в корзине:");
            for (Map.Entry<String, Integer> entry : basket.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " шт.");
            }
        }
    }
}
